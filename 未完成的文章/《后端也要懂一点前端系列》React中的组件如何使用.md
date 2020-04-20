在上一篇文章中我们简单讲解了如何在项目中引用React并且如何简单使用jsx语法，接下来我们就来讲解React如何定义组件。

## 如何定义组件

组件允许你将 UI 拆分为独立可复用的代码片段，并对每个片段进行独立构思。组件，从概念上类似于JavaScript函数。它接受任意的入参（即 “props”），并返回用于描述页面展示内容的React元素。

接下来我们就大概了解一下如何创建组件。

### 无状态函数式组件

在React中，构造函数就是一个最基本的组件。如果想要把组件放到页面中，可以把构造函数的名称当作组件的名称，以HTML标签的形式引入到页面中。 

> React在解析所有的标签的时候，是以标签的首字母来区分的，如果标签的首字母是小写的那么就按照普通的HTML标签来解析，如果首字母是大写，则按照组件的形式去解析

组件的首字母必须是大写的。

```
function Hello(){
    return <div>
        这是我通过Hello组件定义的元素
    </div>
}

ReactDOM.render(<div>
<Hello></Hello>
</div>,document.getElementById("jsx"))

```

此时我们在启动项目就能看到我们的页面了

![](https://tva1.sinaimg.cn/large/006tNbRwly1g9popsi881j30z40bewfn.jpg)

如果我们想要传递值给组件该怎么办呢？只需要在组件中如下使用即可

```
function Hello(){
    return <div>
        这是我通过Hello组件定义的元素 -- name :{name} age : {age}
    </div>
}

var name = "zs"
var age = 20

ReactDOM.render(<div>
<Hello name={name} age={age}></Hello>
</div>,document.getElementById("jsx"))
```

例如我们定义了如下的数据，想要在组件中使用怎么办呢？总不能一个一个数据拼接吧。

```
var person = {
    name:'ls',
    age:27,
    addree: '北京',
    gender: '男'
}

```

在组件中如果想要使用外部传递过来的数据，必须显示的在构造函数参数列表中定义`props`属性来接收。并且在传递时候通过`{...参数名}`来传递。

> 通过`props`得到的任何数据都是只读的，不能重新赋值。 

```
function Hello(props){
    return <div>
        这是我通过Hello组件定义的元素 -- name :{props.name} age : {props.age} addree : {props.addree}
    </div>
}

var name = "zs"
var age = 20

var person = {
    name:'ls',
    age:27,
    addree: '北京',
    gender: '男'
}

ReactDOM.render(<div>
<Hello {...person}></Hello>
</div>,document.getElementById("jsx"))

```

可以看到如下输出。

![](https://tva1.sinaimg.cn/large/006tNbRwly1g9pox3b66oj30yy0b4gn0.jpg)

#### 抽取组件到单独文件中

如果我们将所有的组件都放到`main.js`文件中的话那`main.js`文件就会显得特别臃肿，那么我们将我们自定义的一些组件抽取到单独的文件中呢？我们建立一个`components`文件夹专门用来存放我们自定义的组件，接着我们建立一个`Hello.jsx`文件，然后将我们的`Hello`组件移动过来，并编写如下。

```
import React from 'react'

function Hello(props){
    return <div>
        这是我通过Hello组件定义的元素 -- name :{props.name} age : {props.age} addree : {props.addree}
    </div>
}

// 把创建的组件暴露出去
export default Hello

```

接着在我们需要用到这个组件的地方导入包即可。`import Hello from './components/Hello.jsx'`，此时我们启动项目可能会碰到报错信息，报错信息如下

```
ERROR in ./src/components/Hello.jsx 4:11
Module parse failed: Unexpected token (4:11)
You may need an appropriate loader to handle this file type, currently no loaders are configured to process this file. See https://webpack.js.org/concepts#loaders

```

这个报错信息是我们在`webpack.config.js`文件中只配置了解析`js`文件，而没配置如何解析`jsx`文件导致的，我们将配置修改为如下即可。

```
test: /\.(js)$/,  修改为  test: /\.(jsx|js)$/,

```

### class 组件




## 参考

* [React创建组件的三种方式及其区别](https://www.cnblogs.com/wonyun/p/5930333.html)
* [组件 & Props](https://zh-hans.reactjs.org/docs/components-and-props.html)

