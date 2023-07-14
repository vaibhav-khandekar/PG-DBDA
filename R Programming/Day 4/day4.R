install.packages('EnvStats')
library(EnvStats)

#1 sample variance test

erupt = faithful$eruptions
s1 = erupt[30:80]
var(s1)

#Ho : var(s1) <= 1
#Ha : var(s1) > 1
varTest(s1,sigma.squared = 1,alternative = 'greater')

#we will reject this null hypo

#2 sample variance test
s2 = erupt[210:240]
var(s1)
var(s2)

#Ho : var(s2)/var(s1) >= 1.1
#Ha : var(s2)/var(s1) < 1.1

var(s2)/var(s1)
var.test(s2,s1,ratio = 1.1,alternative = 'less')

#1 sample proportion test

#Ho : atleast 70% of the people in the batch are males
#Ha : prop(males) < 0.7

#from a sample of 84 people, 65 are males
65/80

#from a sample of 84 people, 50 are males
50/80

prop.test(50,84,p=0.7,alternative = 'less')

#p-value is less than 0.05
#so, null hypothesis will be rejected
#It is statististically insignificant
#

prop.test(50,84,p=0.65,alternative = 'less')

#p-value is more than 0.05
#so, null hypothesis will not be rejected
#It is statististically significant
#so we can say that diffrence between claim value and actual value is just a matter of chance variation

#2 sample proportion test

#MH has atleast 12% more covid infected people as compared to GJ
#from MH, in a sample of 150 people, 115 were infected
#from GJ, in a sample of 100 people, 80 were infected

115/150 - 80/100

#Ho : prop(MH) - prop(GJ) >= 0.12
#Ha : prop(MH) - prop(GJ) < 0.12

prop.test(c(115,80),c(150,100),alternative = 'less')

#p-value is misleading, so don't decide on the basis of p-value

#chi-square
#1. goodness of fit
#When we have to check any count is following the particular pattern or not

pattern = c(0.6,0.2,0.15,0.05)
sum(pattern)
cts = c(120,50,40,30)
chisq.test(cts,p=pattern)

sum(cts)
exp = 240*pattern
exp

x = sum((exp-cts)**2/exp)
x

x = (exp - cts)**2/exp
x

#degree of association
train = c(50,80,30)
flight = c(20,50,25)
bus = c(80,30,50)
travel = rbind(train,flight,bus)
colnames(travel) = c('summer','rain','winter')
travel
chisq.test(travel)

#one sample poisson rate
# - to compare the counts obtained from a sample against the claim value.
# - claimed that fewer than 3 accidents take place on the local every day.
# - Ho : n <= 3 and Ha : n > 3
# - In a sample of 20 days, I saw 75 accidents were reported
poisson.test(75,T = 20,r = 3,alternative = 'greater')


#2 sample poisson rate
#ratio of rate of occurances in 2 diffrent samples is compared against the claim value
#in a sample of 30 days, I saw 100 accidents were reported in Banglore

(100/30)/(75/20)

#Ho : rate(BLR) / rate(MUM) = 1
#Ha : rate(BLR) / rate(MUM) != 1

poisson.test(c(100,75),T = c(30,20),r = 1,alternative = 'two.sided')

#here p-value is more than 0.05
#so we did not reject the null hypothesis
#claim value is between the interval

x = c(3,8,6,5,4,8,9,2)
x_sc = (x - mean(x)) / sd(x)
x_sc
mean(x_sc)
sd(x_sc)

#regression models

#1. Simple Linear Regression

#2. Multiple Linear Regression

head(stackloss)
str(stackloss)
mod1 = lm(stack.loss ~ Air.Flow + Water.Temp + Acid.Conc.,data = stackloss)
summary(mod1)

mod2 = lm(stack.loss ~ .,data = stackloss)
summary(mod2)

#residuals
mod3 = lm(eruptions ~ waiting,data = faithful)
plot(mod3)
#shows residuals vs leverages

install.packages('car')
library(car)

head(Salaries)

df = Salaries[,c('rank','yrs.service','salary')]
head(df)

str(df)

levels(df$rank)

#to change the reference
df$rank = relevel(df$rank, ref = 'AsstProf')

mod4 = lm(salary ~ .,data = df)
summary(mod4)

# for every year of service wil decrease in the salary by 150 rs.
# change in the level of rank from assistant proff. to associate proff. would increase your salary by 14615.
# change in the level of rank form assistant proff. to professor it would increase your salary by 49228.

# when we taking contineous data for the reference we can also take 0(zero).

#Logistic Regressions

#1. Binary Logistic Regression

head(mtcars)
unique(mtcars$cyl)
str(mtcars)
df = mtcars[,c('wt','cyl','am')]
head(df)
df$cyl = as.factor(df$cyl)
str(df)
mod1 = glm(am ~ ., data = df,family = 'binomial')
summary(mod1)

# weight
# Ho : weight is not depend on automatic-transmission.
# Ha : weight is depend on automatic-transmission.
# p-value of weight is less than 0.05
# so we will reject null hypothesis.
# corelation - creation is in negative.
# - As weight of the decreases, probability of automatic-transmission is increases by 7.859

# cylinders
# Ho : cylinders is not depend on automatic-transmission.
# Ha : cylinders is depend on automatic-transmission.
# p-value of  is less than 0.05
# so we will reject null hypothesis.
# corelation - creation is in negative.
# - As weight of the decreases, your chances pf automatic-transmission is increases by 7.859

#Nominal / Multi-Nominal Regression

df = read_excel('CDAC_DataBook.xlsx',sheet = 'nominal')
head(df)
df = df[,-2]
head(df)
str(df)
df$ses = as.factor(df$ses)
df$prog = as.factor(df$prog)
str(df)

#isntalling 'nnet' package.
install.packages('nnet')
library(nnet)
mod = multinom(prog ~ ., data = df)
summary(mod)
z = summary(mod)$coefficients/summary(mod)$standard.errors
p = (1 - pnorm(abs(z)))*2
p

#hello