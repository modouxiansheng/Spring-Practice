### RocketMQ

学习RocketMQ之前我们需要先了解一些名词概念：

* Consumer：消息的消费方
* Producer：消息的生产方
* Broker：服务端，即消息的中转地方
* Topic：主题
* Queue：队列
* Consumer Group：消费组

![RockerMQ](https://tva1.sinaimg.cn/large/007S8ZIlly1ggisp131ulj31ge0jywh8.jpg)

* Topic 和 ConsumerGroup 是一个层级的概念
* Queue 和 Consumer 是一个层级的概念
* 生产者向 Topic 中发送消息，Topic 根据不同策略向不同队列中存放数据
* 同一时刻同一个 Queue 只能有一个 Consumer 进行消费


我们可以去[RocketMQ的github地址](https://github.com/apache/rocketmq)上面将代码从上面拉下来。

发现关于生产者Producer所有的测试类都在`DefaultMQProducerTest`类中。可以通过查看类中的方法知道关于Producer提供的功能。

```
init
terminate
testSendMessage_ZeroMessage
testSendMessage_NoNameSrv
testSendMessage_NoRoute
testSendMessageSync_Success
testSendMessageSync_WithBodyCompressed
testSendMessageAsync_Success
testSendMessageAsync
testSendMessageAsync_BodyCompressed
testSendMessageSync_SuccessWithHook
```


### RabbitMQ

![RabbitMQ](https://tva1.sinaimg.cn/large/007S8ZIlly1gglu0zqfwvj30ru07mt9n.jpg)

docker-compose.yml文件


```
version: '2'
services:
 
  #rabbitmq container
  rabbitmq:
    #setup host name
    hostname: myrabbitmq
    #use docker images
    image: rabbitmq:management
    #ports setting
    ports:
      - 15673:15672
      - 5673:5672
    restart: always
    #volumes setting
    volumes:
      - ./data:/var/lib/rabbitmq

```

管理页面[http://127.0.0.1:15673/#/](http://127.0.0.1:15673/#/)，账号/密码：guest/guest