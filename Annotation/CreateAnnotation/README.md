II. Bài 2: Dựa vào demoannotation project, hãy tạo một project java đơn giản sử dụng single value annotaion tự định nghĩa: Thuộc tính của annotaion

Tên annotaion: MyNumberAnnotaion
Retention: runtime
Target: method
Method: value() trả về kiểu int với default là 0.
Tạo class HelloWord với một method sayHello() (In ra dòng sau: "Hello custom annotation") sử dụng annotation trên

Tạo class Test với phương thức main

Tạo một instance HelloWord
Lấy đối tượng Method có tên là "sayHello" (gợi ý: HelloWord h=new HelloWord(); Method m=h.getClass().getMethod("sayHello"));
In ra value của annotation của method m
