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

public class odi {

  public static class KeyPairMapper
       extends Mapper<LongWritable, Text, Text, IntWritable>{

   private final static IntWritable one = new IntWritable(1);
    
    private Text namekey= new Text();

    public void map(LongWritable key, Text value, Context context
                    ) throws IOException, InterruptedException {
    	try {
    	String[] row=value.toString().split(",");
      String name = row[1];
      Integer run = Integer.parseInt(row[2]);
    	
      if ( run >= 100) {
      namekey.set(name);
      context.write(namekey, one);
      }
      }
  	catch(Exception e) {}
      
      }
  }
    

  public static class Countkey
       extends Reducer<Text,IntWritable,Text,IntWritable> {
	  private IntWritable count = new IntWritable();
    private Text pname = new Text();
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
    	  pname.set(key);
      }
    }
     protected void cleanup(Context context) throws IOException,InterruptedException {
    	 count.set(max);
    	 context.write(pname,count);
    	  
      }
    }
  
  

  public static void main(String[] args) throws Exception {
    Configuration conf = new Configuration();
    Job job = Job.getInstance(conf, "word count");
    job.setJarByClass(odi.class);
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
