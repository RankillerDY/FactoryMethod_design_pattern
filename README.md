# Factory Design Pattern

## Mô tả

Dự án này minh họa việc áp dụng Factory Design Pattern trong Java. Factory Pattern là một trong những Creational Design Patterns, được sử dụng để tạo đối tượng mà không cần phải chỉ định chính xác lớp cụ thể sẽ được tạo ra. Pattern này giúp tách rời việc khởi tạo đối tượng khỏi phần còn lại của mã nguồn, giúp mã nguồn dễ dàng mở rộng và bảo trì.

### Factory Design Pattern

Factory Pattern được sử dụng khi bạn cần tạo đối tượng nhưng không muốn chỉ định chính xác lớp cụ thể sẽ được tạo ra. Factory sẽ quyết định lớp cụ thể nào sẽ được khởi tạo dựa trên các thông tin đầu vào.

#### Đặc điểm chính của Factory Design Pattern:
- **Tạo đối tượng linh hoạt**: Cho phép tạo đối tượng mà không cần chỉ định chính xác lớp cụ thể.
- **Tách rời khởi tạo và sử dụng**: Giúp tách rời việc khởi tạo đối tượng khỏi phần còn lại của mã nguồn.

#### Lợi ích của Factory Design Pattern:
- **Dễ dàng mở rộng**: Dễ dàng thêm các lớp mới mà không cần thay đổi mã nguồn hiện có.
- **Giảm sự phụ thuộc**: Giảm sự phụ thuộc vào các lớp cụ thể trong mã nguồn.

## Cài đặt và sử dụng

### Yêu cầu hệ thống

- Java Development Kit (JDK) 8 trở lên.

### Hướng dẫn cài đặt

1. **Clone repository:**
   ```bash
   git clone https://github.com/RankillerDY/factory-design-pattern.git
   cd factory-design-pattern
   ```

2. **Biên dịch các file mã nguồn:**
   ```bash
   javac -d bin src/*.java
   ```

3. **Chạy chương trình:**
   ```bash
   java -cp bin ClientTest
   ```

## Cấu trúc dự án

```plaintext
factory-design-pattern/
├── enums/
│   └── CandyType.java
├── Factory/
│   └── CandyFactory.java
├── Product/
│   ├── Candy.java
│   ├── HardCandy.java
│   └── MintyCandy.java
├── ClientTest.java
└── README.md
```

## Giới thiệu về các thành phần

### Enums
`CandyType.java` là enum định nghĩa các loại kẹo khác nhau mà Factory có thể tạo ra.

### Factory
`CandyFactory.java` là lớp Factory chịu trách nhiệm tạo ra các đối tượng `Candy` dựa trên loại kẹo được yêu cầu.

### Product
`Candy.java` là lớp trừu tượng đại diện cho sản phẩm kẹo.
`HardCandy.java` và `MintyCandy.java` là các lớp cụ thể kế thừa từ `Candy` và cài đặt phương thức `prepare`.

### Client
`ClientTest.java` là lớp Client sử dụng Factory Pattern để tạo ra các đối tượng `Candy`.
