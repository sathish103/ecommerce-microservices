
my-ecommerce-db
admin
s0kj7FCNAWeS53f
ecommerce_db

nohup java -jar user-service-0.0.1-SNAPSHOT.jar > output.log 2>&1 &
nohup java -jar product-service-0.0.1-SNAPSHOT.jar > output.log 2>&1 &
nohup java -jar order-service-0.0.1-SNAPSHOT.jar > output.log 2>&1 &
nohup java -jar cart-service-0.0.1-SNAPSHOT.jar > output.log 2>&1 &
nohup java -jar payment-service-0.0.1-SNAPSHOT.jar > output.log 2>&1 &
nohup java -jar inventory-service-0.0.1-SNAPSHOT.jar > output.log 2>&1 &
nohup java -jar notification-service-0.0.1-SNAPSHOT.jar > output.log 2>&1 &
nohup java -jar review-service-0.0.1-SNAPSHOT.jar > output.log 2>&1 &
nohup java -jar admin-service-0.0.1-SNAPSHOT.jar > output.log 2>&1 &
nohup java -jar discount-service-0.0.1-SNAPSHOT.jar > output.log 2>&1 &
nohup java -jar search-service-0.0.1-SNAPSHOT.jar > output.log 2>&1 &


http://18.142.43.188:8081/users
http://18.142.43.188:8081/products
http://18.142.43.188:8081/orders
http://18.142.43.188:8081/cart
http://18.142.43.188:8081/payments
http://18.142.43.188:8081/inventory
http://18.142.43.188:8081/notifications
http://18.142.43.188:8081/reviews
http://18.142.43.188:8081/admin
http://18.142.43.188:8081/discounts
http://18.142.43.188:8081/search

