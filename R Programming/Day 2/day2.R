#for loop example
fun = function() {
  x = c(3,8,7,6,1,4,0,8)
  for (ctr in x) {
    print(ctr**2)
  }
  print('hello guys')
}

#for loop example
myfun = function() {
  x = c(3,8,7,6,1,4,0,8)
  for (ctr in 1 : length(x)) {
    print(x[ctr]**2)
  }
}

#while loop example -> credit limit program
creditcard = function() {
  credit_limit = 1000
  while (credit_limit > 0) {
    purchase = as.numeric(readline('enter the purchase amount = '))
    credit_limit = credit_limit - purchase
    message('your remaining credit limit = ',credit_limit)
  }
  print('your credit card reach to the spend limit')
}

#next / pass statement
fun2 = function() {
  x = c(3,8,7,6,1,4,0,8)
  for (ctr in x) {
    if (ctr %in% c(0,1)) {
      next
    }
    else {
      print(ctr**2)
    }
  }
}

#break statement
fun2 = function() {
  x = c(3,8,7,6,1,4,0,8)
  for (ctr in x) {
    if (ctr %in% c(0,1)) {
      break
    }
    else {
      print(ctr**2)
    }
  }
}

#function
mycal = function(x,y) {
  #a =5
  z = 2*x + y + a
  t = x + y
  print(z)
  return(z)
}

mycal = function(x,y) {
  #a =5
  z = 2*x + y + a
  t = x + y
  print(z)
  return(c(z,t))
}

mycal = function(x,y) {
  #a =5
  z = 2*x + y + a
  t = x + y
  print(z)
  return(list(z,t))
}

mycal = function(x,y) {
  z = 2 * x + y
  print(z)
  return(z)
}

mainfun = function(a,b) {
  t = mycal(a,3)
  z = t + b
  print(z)
}

#adding one extra column by using function
mydf = function() {
  x = df$Quantity
  y = c()
  for (ctr in 1 : nrow(df)) {
    if (x[ctr] < 50) {
      y[ctr] = 'scrap'
    }
    else {
      y[ctr] = 'useful'
    }
  }
  df$status = y
  print(head(df))
  print(sum(df$Quantity[df$status=='scrap']))
  print(sum(df$Quantity[df$status=='useful']))
}


