oz <-airquality$Ozone
temp<-airquality$Temp
boxplot(oz,temp,names = c("OZ","TEMP"),col=c("2","3"))

library(ggplot2)

ggplot(data = mpg)+
  geom_point(mapping = aes(x = displ, y = hwy,colour = class))

ggplot(data = mpg)+
  geom_point(mapping = aes(x = displ, y = hwy,colour = class))+
  facet_grid(manufacturer~hwy)

ggplot(data = mpg)+
  geom_bar(mapping = aes(x = class, fill = class))
           
diamonds
?diamonds
ggplot(data= diamonds)+
  geom_histogram(mapping = aes(x = carat, binwidth = 0.5))

ggplot(data= diamonds)+
  geom_histogram(mapping = aes(x = carat))

ggplot(data = mpg)+
  geom_boxplot(mapping = aes(x = class,y=hwy,fill = class))


file.choose()
a<-read.csv("path")
b<-read.txt(file.choose())