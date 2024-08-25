# spring-boot-course
Có thể move lớp chứa hàm main sang nơi khác. Vì hàm main được đánh dấu bằng @SpringBootApplication
nơi nó chứa @ComponentScan là nó sẽ quét những component. 
Ví dụ: Tạo 1 package chứa hàm main thì nó vẫn chạy bình thường, vì khi @ComponentScan sẽ quét từ trên xuống. Nếu hàm main không có gì hết thì sẽ quét không ra file resource nên khi chạy sẽ not found.
Ngược lại khi move file main ra package gốc ban đầu thì nó sẽ chạy được file resource.
