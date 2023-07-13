package romeo;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class max2004 {

  public static class KeyPairMapper
       extends Mapper<LongWritable, Text, Text, IntWritable>{

   private final static IntWritable one = new IntWritable(1);
    
    private Text plane= new Text();

    public void map(LongWritable key, Text value, Context context
                    ) throws IOException, InterruptedException {
    	String[] line=value.toString().split(",");
      String year = line[1];
      String airport_id = line[17];
      if (year.equals("2004")) {
      plane.set(airport_id);
      context.write(plane, one);
      }
      }
  }
    

  public static class Countkey
       extends Reducer<Text,IntWritable,Text,IntWritable> {
	  private IntWritable result = new IntWritable();
    private Text airport_id = new Text();
    private int max=0;

    public void reduce(Text key, Iterable<IntWritable> values,
                       Context context
                       ) throws IOException, InterruptedException {
      int sum = 0;
      for (IntWritable val : values) {
    		  sum += val.get();
      }
      if (sum>max) {
    	  max=sum;
    	  airport_id.set(key);
    	  
      }
    }
     protected void cleanup(Context context) throws IOException,InterruptedException {
    	 result.set(max);
    	 context.write(airport_id,result);
    	  
      }
    }
  
  

  public static void main(String[] args) throws Exception {
    Configuration conf = new Configuration();
    Job job = Job.getInstance(conf, "word count");
    job.setJarByClass(max2004.class);
    job.setMapperClass(KeyPairMapper.class);
    job.setReducerClass(Countkey.class);
    job.setNumReduceTasks(1);
    
    job.setMapOutputKeyClass(Text.class);
    job.setMapOutputValueClass(IntWritable.class);
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(IntWritable.class);
    FileInputFormat.addInputPath(job, new Path(args[0]));
    FileOutputFormat.setOutputPath(job, new Path(args[1]));
    System.exit(job.waitForCompletion(true) ? 0 : 1);
  }
}
