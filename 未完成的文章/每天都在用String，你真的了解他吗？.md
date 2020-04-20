> 本文关于String的知识都是基于1.8版本写的

1. String pool里面存放的char数组还是String对象

|命令|含义|
|-----|-----|
|ldc|将int、float或String型常量值从常量池中推送至栈顶|
|astore|将栈顶引用型数值存入指定本地变量|
|astore_num|将栈顶引用引用型数值存入第num个本地变量|
|dup|赋值栈顶数值并将复制值压入栈顶|
|new|创建一个对象，并将其引用值压入栈顶|

## 参考

* [How and where does String literals in Java stored in the memory?](https://www.tutorialspoint.com/how-and-where-does-string-literals-in-java-stored-in-the-memory)
* [深入解析String#intern](https://tech.meituan.com/2014/03/06/in-depth-understanding-string-intern.html)
* [Is String Literal Pool a collection of references to the String Object, Or a collection of Objects](https://stackoverflow.com/questions/11700320/is-string-literal-pool-a-collection-of-references-to-the-string-object-or-a-col)