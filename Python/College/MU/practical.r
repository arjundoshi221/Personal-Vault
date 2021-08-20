library(quantmod)
library(ggplot2)
library(BatchGetSymbols)



stocks1 <-c("FB", "AAPL", "GOOG")
prices1 <- getSymbols(stocks1[1], source="yahoo", auto.assign=FALSE,
                      return.class="xts")[,6]
prices2 <- getSymbols(stocks1[2], source="yahoo", auto.assign=FALSE,
                      return.class="xts")[,6]
prices3 <- getSymbols(stocks1[3], source="yahoo", auto.assign=FALSE,
                      return.class="xts")[,6]
prices_data <- cbind(prices1, prices2,prices3)

prices_data
Portfolio1 <- na.omit(diff(log(prices_data)))
Portfolio1
View(prices_data)
ggplot(data = Portfolio1)+
  geom_boxplot(mapping = aes(y = GOOG.Adjusted))