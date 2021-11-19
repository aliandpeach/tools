namespace java com.tool.service // 定义命名空间

//include "test.thrift" // 包含外部的接口文件

struct Hello
{
    1: i32 id, // Id
    2: string name // 名称
}


service IHelloService
{
    string say(1:Hello hello)
}