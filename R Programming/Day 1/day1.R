message("hey vaibhav whatsup!")

#todays date
date = 26
print(date)

mycal = function(x,y){
  z = 2*x+y
  print(z)
}

cal_tax = function(salary){
  tax = salary*10/100
  message('your basic salary is ',salary - tax)
  message('your tax is ',tax)
}

#method 1
cal_tax = function(salary){
  if(salary <=20000){
    message('your basic salary is ',salary - 500)
    message('your tax is ',500)
  }
  else{
    tax = salary*10/100
    message('your basic salary is ',salary - tax)
    message('your tax is ',tax)
  }
}

#method 2
cal_tax = function(salary){
  if(salary <=20000){
    tax = 500
    message('your basic salary is ',salary - tax)
  }
  else{
    tax = salary*10/100
    message('your basic salary is ',salary - tax)
  }
  message('your tax is ',tax)
}

#salary program
#salary <=20000 - tax = 500
#20000 <= salary <= 50000 - tax = 10/100
#salary >= 50000 - tax = 20/100

#method 1
cal_tax = function(salary){
  if(salary <=20000){
    tax = 500
    message('your basic salary is ',salary - tax)
  }
  else if(20000 > salary & salary < 50000){
    tax = salary*10/100
    message('your basic salary is ',salary - tax)
  }
  else{
    tax = salary*20/100
    message('your basic salary is ',salary - tax)
  }
  message('your tax is ',tax)
}

#method 2
cal_tax = function(salary){
  if(salary <=20000){
    tax = 500
  }
  else if(20000 > salary & salary < 50000){
    tax = salary*10/100
  }
  else{
    tax = salary*20/100
  }
  message('your basic salary is ',salary - tax)
  message('your tax is ',tax)
}

tax_cal = function(salary){
  rate = ifelse(salary <= 25000,0.1,0.2) #same as ternary operator
  print(rate)
}

tax_rate = function(client){
  rate = switch(client, G=0.05,P=0.2,E=0.1,0.3)
  message('rate will be ',rate)
}