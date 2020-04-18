# springboot-mutil
springboot多模块同时启动多个实例

- 配置不同的端口，例如：

  ```yml
  server:
    port: 8085
  ```

  ```yml
  server:
    port: 8086
  ```

  

-   多模块目录结构如下：

  ![](https://github.com/luhix/springboot-multi/blob/master/sb-001/img/20200418102331.png)

- 分别启动 LoginApplication 和 UserApplication
