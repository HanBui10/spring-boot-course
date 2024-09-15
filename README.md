# spring-boot-course
Có thể move/dời class chứa hàm main sang nơi khác không? Vì sao?
   
Có thể move lớp chứa hàm main sang nơi khác. Vì hàm main được đánh dấu bằng @SpringBootApplication
nơi nó chứa @ComponentScan là nó sẽ quét những component. 
Ví dụ: Tạo 1 package chứa hàm main thì nó vẫn chạy bình thường, vì khi @ComponentScan sẽ quét từ trên xuống. Nếu hàm main không có gì hết thì sẽ quét không ra file resource nên khi chạy sẽ not found.
Ngược lại khi move file main ra package gốc ban đầu thì nó sẽ chạy được file resource.


1. Sự khác biệt giữa @OneToOne và @ManyToOne
@OneToOne
- Khái niệm: Một thực thể A liên kết với đúng một thực thể B và ngược lại.
- Ví dụ: Một người (Person) chỉ có một hộ chiếu (Passport), và một hộ chiếu chỉ thuộc về một người.
 @ManyToOne
- Khái niệm: Nhiều thực thể A có thể liên kết với một thực thể B, nhưng một thực thể B chỉ liên kết với một thực thể A.
- Ví dụ: Nhiều sinh viên (Student) có thể thuộc cùng một lớp học (Class), nhưng mỗi lớp học chỉ thuộc về một giáo viên (Teacher).

2. Nghiên cứu quan hệ 2 chiều (bidirectional relationship), chú ý mappedBy
- Quan hệ 2 chiều cho phép bạn di chuyển qua lại giữa hai thực thể liên kết với nhau.
- mappedBy là một thuộc tính trong JPA (Java Persistence API) dùng để thiết lập quan hệ hai chiều giữa các thực thể. 

