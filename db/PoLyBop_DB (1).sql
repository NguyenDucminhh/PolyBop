CREATE DATABASE PoLyBop 
GO 

USE PoLyBop
GO 

-- Tạo bảng 
CREATE TABLE [LoaiVi] (
  [IDLoaiVi] INT IDENTITY,
  [TenLoaiVi] Nvarchar(50),
  [TrangThai] BIT,
  PRIMARY KEY ([IDLoaiVi])
);

CREATE TABLE [ChatLieu] (
  [IDChatLieu] INT IDENTITY,
  [TenChatLieu] Nvarchar(50),
  [TrangThai] BIT,
  PRIMARY KEY ([IDChatLieu])
);

CREATE TABLE [XuatXu] (
  [IDXuatXu] INT IDENTITY,
  [TenXuatXu] Nvarchar(50),
  [TrangThai] BIT,
  PRIMARY KEY ([IDXuatXu])
);

CREATE TABLE [ThuongHieu] (
  [IDThuongHieu] INT IDENTITY,
  [TenThuongHieu] Nvarchar(50),
  [TrangThai] BIT,
  PRIMARY KEY ([IDThuongHieu])
);

CREATE TABLE [Vi] (
  [IDVi] INT IDENTITY,
  [ID_ThuongHieu] INT,
  [KieuDang] NVARCHAR(50),
  [TenVi] NVARCHAR(50),
  [Url_Anh] VARCHAR(200),
  [TrangThai] BIT,
  PRIMARY KEY ([IDVi]),
  CONSTRAINT [FK_Vi.ID_ThuongHieu]
    FOREIGN KEY ([ID_ThuongHieu])
      REFERENCES [ThuongHieu]([IDThuongHieu])
);

CREATE TABLE [MauSac] (
  [IDMauSac] INT IDENTITY,
  [TenMauSac] Nvarchar(50),
  [TrangThai] BIT,
  PRIMARY KEY ([IDMauSac])
);

CREATE TABLE [ChiTietVi] (
  [IDChiTietVi] INT IDENTITY,
  [ID_Vi] INT,
  [ID_MauSac] INT,
  [ID_ChatLieu] INT,
  [ID_XuatXu] INT,
  [ID_LoaiVi] INT,
  [KhoaVi] Nvarchar(50),
  [SoNganDungThe] VARCHAR(50),
  [SoLuong] INT,
  [GiaNhap] Decimal,
  [GiaBan] Decimal,
  [NgayNhap] Date,
  [TrangThai] BIT,
  PRIMARY KEY ([IDChiTietVi]),
  CONSTRAINT [FK_ChiTietVi.ID_LoaiVi]
    FOREIGN KEY ([ID_LoaiVi])
      REFERENCES [LoaiVi]([IDLoaiVi]),
  CONSTRAINT [FK_ChiTietVi.ID_ChatLieu]
    FOREIGN KEY ([ID_ChatLieu])
      REFERENCES [ChatLieu]([IDChatLieu]),
  CONSTRAINT [FK_ChiTietVi.ID_XuatXu]
    FOREIGN KEY ([ID_XuatXu])
      REFERENCES [XuatXu]([IDXuatXu]),
  CONSTRAINT [FK_ChiTietVi.ID_Vi]
    FOREIGN KEY ([ID_Vi])
      REFERENCES [Vi]([IDVi]),
  CONSTRAINT [FK_ChiTietVi.ID_MauSac]
    FOREIGN KEY ([ID_MauSac])
      REFERENCES [MauSac]([IDMauSac])
);

CREATE TABLE [NhanVien] (
  [IDNhanVien] INT IDENTITY,
  [HoTen] Nvarchar(50),
  [ChucVu] BIT,
  [NgaySinh] Date,
  [SDT] Nvarchar(10),
  [Email] Nvarchar(50),
  [GioiTinh] BIT,
  [DiaChi] Nvarchar(50),
  [MatKhau] Nvarchar(32),
  [TrangThai] BIT,
  PRIMARY KEY ([IDNhanVien])
);

CREATE TABLE [KhachHang] (
  [IDKhangHang] INT IDENTITY,
  [TenKhachHang] Nvarchar(50),
  [SDT] Nvarchar(50),
  [NgaySinh] Date,
  [Email] Nvarchar(50),
  [DiaChi] Nvarchar(50),
  [TrangThai] BIT,
  PRIMARY KEY ([IDKhangHang])
);

CREATE TABLE [KhuyenMai] (
  [IDKhuyenMai] INT IDENTITY,
  [MaKhuyenMai] Nvarchar(10),
  [GiaTri] INT,
  [NgayBatDau] Date,
  [NgayKetThuc] Date,
  [KieuGiamGia] Decimal,
  [TrangThai] BIT,
  PRIMARY KEY ([IDKhuyenMai])
);

CREATE TABLE [HoaDon] (
  [IDHoaDon] INT IDENTITY,
  [ID_KhachHang] INT,
  [ID_NhanVien] INT,
  [ID_KhuyenMai] INT,
  [TienSauGiamGia] Decimal,
  [ThanhTien] Decimal,
  [PhuongThucThanhToan] BIT,
  [NgayThanhToan] Date,
  [TrangThai] BIT,
  PRIMARY KEY ([IDHoaDon]),
  CONSTRAINT [FK_HoaDon.ID_NhanVien]
    FOREIGN KEY ([ID_NhanVien])
      REFERENCES [NhanVien]([IDNhanVien]),
  CONSTRAINT [FK_HoaDon.ID_KhachHang]
    FOREIGN KEY ([ID_KhachHang])
      REFERENCES [KhachHang]([IDKhangHang]),
  CONSTRAINT [FK_HoaDon.ID_KhuyenMai]
    FOREIGN KEY ([ID_KhuyenMai])
      REFERENCES [KhuyenMai]([IDKhuyenMai])
);

CREATE TABLE [HoaDonChiTiet] (
  [IDHoaDonChiTiet] INT IDENTITY,
  [ID_HoaDon] INT,
  [ID_ChiTietVi] INT,
  [SoLuong] INT,
  [DonGia] Decimal,
  [TrangThai] BIT,
  PRIMARY KEY ([IDHoaDonChiTiet]),
  CONSTRAINT [FK_HoaDonChiTiet.ID_ChiTietVi]
    FOREIGN KEY ([ID_ChiTietVi])
      REFERENCES [ChiTietVi]([IDChiTietVi]),
  CONSTRAINT [FK_HoaDonChiTiet.ID_HoaDon]
    FOREIGN KEY ([ID_HoaDon])
      REFERENCES [HoaDon]([IDHoaDon])
);

CREATE TABLE [GioHang] (
  [IDGioHang] INT IDENTITY,
  [ID_KhachHang] INT,
  [NgayTao] Date,
  [TrangThai] BIT,
  PRIMARY KEY ([IDGioHang]),
  CONSTRAINT [FK_GioHang.ID_KhachHang]
    FOREIGN KEY ([ID_KhachHang])
      REFERENCES [KhachHang]([IDKhangHang])
);

CREATE TABLE [ChiTietGioHang] (
  [IDChiTietGioHang] INT IDENTITY,
  [ID_GioHang] INT,
  [ID_ChiTietVi] INT,
  [SoLuong] INT,
  [TrangThai] BIT,
  PRIMARY KEY ([IDChiTietGioHang]),
  CONSTRAINT [FK_ChiTietGioHang.ID_GioHang]
    FOREIGN KEY ([ID_GioHang])
      REFERENCES [GioHang]([IDGioHang]),
  CONSTRAINT [FK_ChiTietGioHang.ID_ChiTietVi]
    FOREIGN KEY ([ID_ChiTietVi])
      REFERENCES [ChiTietVi]([IDChiTietVi])
);
-- Thêm dữ liệu vào bảng ChatLieu
INSERT INTO ChatLieu (TenChatLieu, TrangThai)
VALUES 
  (N'Gỗ', 1),
  (N'Sắt', 1),
  (N'Nhựa', 1),
  (N'Kính', 1),
  (N'Da', 1),
  (N'Metal', 1),
  (N'Bông', 1),
  (N'Lụa', 1),
  (N'Gốm sứ', 1),
  (N'Chất liệu tổng hợp', 1),
  (N'Vải', 1),
  (N'Carbon', 1),
  (N'Đá', 1),
  (N'Cao su', 1),
  (N'Hợp kim', 1),
  (N'Kim loại quý', 1),
  (N'Vật liệu tái chế', 1),
  (N'Mica', 1),
  (N'Composite', 1),
  (N'Xốp', 1);
-- Thêm dữ liệu vào bảng XuatXu
INSERT INTO XuatXu (TenXuatXu, TrangThai)
VALUES 
  (N'Việt Nam', 1),
  (N'Trung Quốc', 1),
  (N'Hàn Quốc', 1),
  (N'Mỹ', 1),
  (N'Nhật Bản', 1),
  (N'Đức', 1),
  (N'Úc', 1),
  (N'Anh', 1),
  (N'Pháp', 1),
  (N'Ý', 1),
  (N'Thái Lan', 1),
  (N'Indonesia', 1),
  (N'Brazil', 1),
  (N'Argentina', 1),
  (N'Canada', 1),
  (N'Rusia', 1),
  (N'Séc', 1),
  (N'Greece', 1),
  (N'Malaysia', 1),
  (N'Singapore', 1);
-- Thêm dữ liệu vào bảng MauSac
INSERT INTO MauSac (TenMauSac, TrangThai)
VALUES 
  (N'Do', 1),
  (N'Xanh lá cây', 1),
  (N'Vàng', 1),
  (N'Tím', 1),
  (N'Cam', 1),
  (N'Đen', 1),
  (N'Trắng', 1),
  (N'Hồng', 1),
  (N'Xám', 1),
  (N'Nâu', 1),
  (N'Xanh dương', 1),
  (N'Đỏ rượu', 1),
  (N'Champagne', 1),
  (N'Ghi', 1),
  (N'Xanh ngọc', 1),
  (N'Xanh lam', 1),
  (N'Vàng nhạt', 1),
  (N'Nâu đậm', 1),
  (N'Hồng nhạt', 1),
  (N'Xanh lục', 1);
-- Thêm dữ liệu vào bảng ThuongHieu
INSERT INTO ThuongHieu (TenThuongHieu, TrangThai)
VALUES 
  (N'Nike', 1),
  (N'Adidas', 1),
  (N'Puma', 1),
  (N'Converse', 1),
  (N'Reebok', 1),
  (N'Vans', 1),
  (N'New Balance', 1),
  (N'Gucci', 1),
  (N'Louis Vuitton', 1),
  (N'Balenciaga', 1),
  (N'Fila', 1),
  (N'Under Armour', 1),
  (N'Yeezy', 1),
  (N'Prada', 1),
  (N'Jordan', 1),
  (N'Off-White', 1),
  (N'Asics', 1),
  (N'Skechers', 1),
  (N'Timberland', 1),
  (N'Chanel', 1);
-- Thêm dữ liệu chi tiết vào bảng Vi
INSERT INTO Vi (ID_ThuongHieu, KieuDang, TenVi, Url_Anh, TrangThai)
VALUES 
  (1, N'Bifold', N'Premium Leather', 'bifold.jpg', 1),
  (2, N'Trifold', N'Sporty RFID-Blocking', 'trifold.jpg', 1),
  (3, N'Slim', N'Elegant Slim RFID', 'minimalist.jpg', 1),
  (1, N'Bifold', N'Modern Slim Bifold', 'pocket.jpg', 1),
  (2, N'Trifold', N'Adventure-Ready', 'trifold.jpg', 1),
  (3, N'Slim', N'Luxury Metal RFID', 'rfid.jpg', 1),
  (4, N'Card Holder', N'Sleek Business', 'holder.jpg', 1),
  (5, N'Zip-Around', N'Fashionable Zip-Around', 'strap.jpg', 1),
  (6, N'Clutch', N'Chic Leather Clutch', 'chain.jpg', 1),
  (4, N'Card Holder', N'Minimalist Wooden', 'engraving.jpg', 1),
  (5, N'Zip-Around', N'Trendy Zip-Around', 'print.jpg', 1),
  (6, N'Clutch', N'Vintage Velvet', 'embellishments.jpg', 1),
  (7, N'Coin Purse', N'Adorable Animal', 'purse.jpg', 1),
  (8, N'Wristlet', N'Stylish Wristlet', 'wristlet.jpg', 1),
  (9, N'Phone Wallet', N'Smartphone', 'wallet.jpg', 1),
  (7, N'Coin Purse', N'Cute Emoji', 'purse.jpg', 1),
  (8, N'Wristlet', N'Metallic Wristlet', 'wristlet.jpg', 1),
  (9, N'Phone Wallet', N'Luxury Leather', 'rfid.jpg', 1),
  (10, N'Money Clip', N'Stainless Steel', 'engraving.jpg', 1),
  (10, N'Money Clip', N'Engraved Wooden', 'closure.jpg', 1);
  -- Thêm 20 dữ liệu vào bảng LoaiVi
INSERT INTO LoaiVi (TenLoaiVi, TrangThai)
VALUES 
  (N'Ví Cầm Tay', 1),
  (N'Ví Nam', 1),
  (N'Ví Nữ', 1),
  (N'Ví Mini', 1),
  (N'Ví Thể Thao', 1),
  (N'Ví Đeo Chéo', 1),
  (N'Ví Vintage', 1),
  (N'Ví Quai Xách', 1),
  (N'Ví Cao Cấp', 1),
  (N'Ví Dáng Dài', 1),
  (N'Ví Dáng Ngắn', 1),
  (N'Ví Da Bò', 1),
  (N'Ví Da Cá Sấu', 1),
  (N'Ví Da Bò Cao Cấp', 1),
  (N'Ví Học Sinh', 1),
  (N'Ví Sinh Viên', 1),
  (N'Ví Công Sở', 1),
  (N'Ví Thời Trang', 1),
  (N'Ví Dự Tiệc', 1),
  (N'Ví Công Nghệ', 1);
-- Thêm 20 dữ liệu vào bảng ChiTietVi
INSERT INTO ChiTietVi (ID_Vi, ID_MauSac, ID_ChatLieu, ID_XuatXu, ID_LoaiVi, KhoaVi, SoNganDungThe, SoLuong, GiaNhap, GiaBan, NgayNhap, TrangThai)
VALUES 
  (1, 1, 1, 1, 1, N'KV001', '4 Card Slots', 100, 50.00, 80.00, '2024-01-10', 1),
  (2, 2, 2, 2, 2, N'KV002', '6 Card Slots', 80, 65.00, 100.00, '2024-01-11', 1),
  (3, 3, 3, 3, 3, N'KV003', '2 Card Slots', 120, 40.00, 60.00, '2024-01-12', 1),
  (4, 4, 4, 4, 4, N'KV004', '8 Card Slots', 90, 75.00, 110.00, '2024-01-13', 1),
  (5, 5, 5, 5, 5, N'KV005', '5 Card Slots', 110, 55.00, 90.00, '2024-01-14', 1),
  (6, 6, 6, 6, 6, N'KV006', '3 Card Slots', 95, 45.00, 70.00, '2024-01-15', 1),
  (7, 7, 7, 7, 7, N'KV007', '10 Card Slots', 130, 80.00, 120.00, '2024-01-16', 1),
  (8, 8, 8, 8, 8, N'KV008', '4 Card Slots', 70, 60.00, 95.00, '2024-01-17', 1),
  (9, 9, 9, 9, 9, N'KV009', '7 Card Slots', 105, 70.00, 105.00, '2024-01-18', 1),
  (10, 10, 10, 10, 10, N'KV010', '6 Card Slots', 85, 55.00, 85.00, '2024-01-19', 1),
  (1, 1, 1, 1, 1, N'KV011', '4 Card Slots', 95, 50.00, 75.00, '2024-01-20', 1),
  (2, 2, 2, 2, 2, N'KV012', '6 Card Slots', 75, 65.00, 95.00, '2024-01-21', 1),
  (3, 3, 3, 3, 3, N'KV013', '2 Card Slots', 115, 40.00, 65.00, '2024-01-22', 1),
  (4, 4, 4, 4, 4, N'KV014', '8 Card Slots', 88, 75.00, 115.00, '2024-01-23', 1),
  (5, 5, 5, 5, 5, N'KV015', '5 Card Slots', 108, 55.00, 88.00, '2024-01-24', 1),
  (6, 6, 6, 6, 6, N'KV016', '3 Card Slots', 93, 45.00, 73.00, '2024-01-25', 1),
  (7, 7, 7, 7, 7, N'KV017', '10 Card Slots', 127, 80.00, 122.00, '2024-01-26', 1),
  (8, 8, 8, 8, 8, N'KV018', '4 Card Slots', 68, 60.00, 98.00, '2024-01-27', 1),
  (9, 9, 9, 9, 9, N'KV019', '7 Card Slots', 103, 70.00, 108.00, '2024-01-28', 1),
  (10, 10, 10, 10, 10, N'KV020', '6 Card Slots', 82, 55.00, 82.00, '2024-01-29', 1);
-- Thêm 20 dữ liệu vào bảng KhachHang
INSERT INTO KhachHang (TenKhachHang, SDT, NgaySinh, Email, DiaChi, TrangThai)
VALUES 
  (N'Nguyen Van A', '0987654321', '1990-01-15', 'nguyenvana@example.com', N'123 Street, City A', 1),
  (N'Tran Thi B', '0901234567', '1985-05-20', 'tranthib@example.com', N'456 Street, City B', 1),
  (N'Le Van C', '0978765432', '1995-11-10', 'levanc@example.com', N'789 Street, City C', 1),
  (N'Pham Thi D', '0912345678', '1988-08-25', 'phamthid@example.com', N'101 Street, City D', 1),
  (N'Hoang Van E', '0965432109', '1992-03-05', 'hoangve@example.com', N'202 Street, City E', 1),
  (N'Nguyen Thi F', '0932109876', '1980-12-01', 'nguyenthif@example.com', N'303 Street, City F', 1),
  (N'Tran Van G', '0945678901', '1998-06-15', 'tranvg@example.com', N'404 Street, City G', 1),
  (N'Le Thi H', '0956789012', '1993-09-30', 'lethih@example.com', N'505 Street, City H', 1),
  (N'Pham Van I', '0923456789', '1983-04-20', 'phamvi@example.com', N'606 Street, City I', 1),
  (N'Hoang Thi K', '0912345678', '1996-07-10', 'hoangthik@example.com', N'707 Street, City K', 1),
  (N'Vu Van L', '0987654321', '1991-02-18', 'vuvanl@example.com', N'808 Street, City L', 1),
  (N'Hoang Thi M', '0901234567', '1986-06-22', 'hoangthim@example.com', N'909 Street, City M', 1),
  (N'Nguyen Van N', '0978765432', '1994-10-05', 'nguyenvann@example.com', N'1010 Street, City N', 1),
  (N'Tran Thi P', '0912345678', '1987-03-15', 'tranthip@example.com', N'1111 Street, City P', 1),
  (N'Le Van Q', '0965432109', '1990-08-10', 'leq@example.com', N'1212 Street, City Q', 1),
  (N'Pham Van R', '0932109876', '1982-01-28', 'phamvr@example.com', N'1313 Street, City R', 1),
  (N'Tran Van S', '0945678901', '1997-04-12', 'trans@example.com', N'1414 Street, City S', 1),
  (N'Le Thi T', '0956789012', '1992-09-08', 'lethit@example.com', N'1515 Street, City T', 1),
  (N'Nguyen Van U', '0923456789', '1984-12-25', 'nguyenvu@example.com', N'1616 Street, City U', 1),
  (N'Hoang Van V', '0912345678', '1995-07-03', 'hoangvv@example.com', N'1717 Street, City V', 1);
-- Thêm 20 dữ liệu vào bảng KhuyenMai
INSERT INTO KhuyenMai (MaKhuyenMai, GiaTri, NgayBatDau, NgayKetThuc, KieuGiamGia, TrangThai)
VALUES 
  (N'KM006', 12, '2024-06-01', '2024-06-30', 0.15, 1),
  (N'KM007', 18, '2024-07-05', '2024-07-25', 0.2, 1),
  (N'KM008', 22, '2024-08-10', '2024-08-30', 0.25, 1),
  (N'KM009', 28, '2024-09-15', '2024-10-05', 0.3, 1),
  (N'KM010', 10, '2024-10-20', '2024-11-10', 0.12, 1),
  (N'KM011', 15, '2024-11-25', '2024-12-15', 0.18, 1),
  (N'KM012', 20, '2025-01-01', '2025-01-20', 0.22, 1),
  (N'KM013', 25, '2025-02-05', '2025-02-25', 0.28, 1),
  (N'KM014', 30, '2025-03-10', '2025-03-30', 0.32, 1),
  (N'KM015', 12, '2025-04-05', '2025-04-25', 0.16, 1),
  (N'KM016', 18, '2025-05-10', '2025-05-30', 0.21, 1),
  (N'KM017', 22, '2025-06-15', '2025-07-05', 0.26, 1),
  (N'KM018', 28, '2025-07-20', '2025-08-10', 0.31, 1),
  (N'KM019', 10, '2025-08-25', '2025-09-15', 0.14, 1),
  (N'KM020', 15, '2025-09-30', '2025-10-20', 0.19, 1),
  (N'KM021', 20, '2025-10-05', '2025-10-25', 0.24, 1),
  (N'KM022', 25, '2025-11-10', '2025-11-30', 0.29, 1),
  (N'KM023', 30, '2025-12-15', '2025-12-30', 0.33, 1),
  (N'KM024', 12, '2026-01-05', '2026-01-25', 0.17, 1),
  (N'KM025', 18, '2026-02-10', '2026-02-28', 0.23, 1);
-- Thêm 20 dữ liệu vào bảng NhanVien
INSERT INTO NhanVien (HoTen, ChucVu, NgaySinh, SDT, Email, GioiTinh, DiaChi, MatKhau, TrangThai)
VALUES 
  (N'Vu Van L', 1, '1991-02-18', '0987654321', 'vuvanl@example.com', 1, N'808 Street, City L', 'hashed_password_l', 1),
  (N'Hoang Thi M', 0, '1986-06-22', '0901234567', 'hoangthim@example.com', 0, N'909 Street, City M', 'hashed_password_m', 1),
  (N'Nguyen Van N', 1, '1994-10-05', '0978765432', 'nguyenvann@example.com', 1, N'1010 Street, City N', 'hashed_password_n', 1),
  (N'Tran Thi P', 0, '1987-03-15', '0912345678', 'tranthip@example.com', 0, N'1111 Street, City P', 'hashed_password_p', 1),
  (N'Le Van Q', 1, '1990-08-10', '0965432109', 'leq@example.com', 1, N'1212 Street, City Q', 'hashed_password_q', 1),
  (N'Pham Van R', 0, '1982-01-28', '0932109876', 'phamvr@example.com', 0, N'1313 Street, City R', 'hashed_password_r', 1),
  (N'Tran Van S', 1, '1997-04-12', '0945678901', 'trans@example.com', 1, N'1414 Street, City S', 'hashed_password_s', 1),
  (N'Le Thi T', 0, '1992-09-08', '0956789012', 'lethit@example.com', 0, N'1515 Street, City T', 'hashed_password_t', 1),
  (N'Nguyen Van U', 1, '1984-12-25', '0923456789', 'nguyenvu@example.com', 1, N'1616 Street, City U', 'hashed_password_u', 1),
  (N'Hoang Van V', 0, '1995-07-03', '0912345678', 'hoangvv@example.com', 0, N'1717 Street, City V', 'hashed_password_v', 1),
  (N'Vu Thi X', 1, '1998-06-01', '0987654321', 'vuthix@example.com', 0, N'1818 Street, City X', 'hashed_password_x', 1),
  (N'Le Van Y', 0, '1983-11-15', '0901234567', 'levany@example.com', 1, N'1919 Street, City Y', 'hashed_password_y', 1),
  (N'Pham Van Z', 1, '1996-04-20', '0978765432', 'phamvanz@example.com', 0, N'2020 Street, City Z', 'hashed_password_z', 1),
  (N'Tran Van W', 0, '1980-09-10', '0912345678', 'tranvanw@example.com', 1, N'2121 Street, City W', 'hashed_password_w', 1),
  (N'Nguyen Thi K', 1, '1989-03-05', '0965432109', 'nguyenthik@example.com', 0, N'2222 Street, City K', 'hashed_password_k', 1),
  (N'Hoang Van M', 0, '1991-08-20', '0932109876', 'hoangvm@example.com', 1, N'2323 Street, City M', 'hashed_password_m', 1),
  (N'Nguyen Thi H', 1, '1985-12-15', '0945678901', 'nguyenhth@example.com', 0, N'2424 Street, City H', 'hashed_password_h', 1),
  (N'Tran Van L', 0, '1992-05-01', '0956789012', 'tranvl@example.com', 1, N'2525 Street, City L', 'hashed_password_l', 1),
  (N'Le Van T', 1, '1984-10-08', '0923456789', 'levt@example.com', 0, N'2626 Street, City T', 'hashed_password_t', 1),
  (N'Pham Thi B', 0, '1993-01-25', '0912345678', 'phamtb@example.com', 1, N'2727 Street, City B', 'hashed_password_b', 1);
-- Thêm 20 dữ liệu vào bảng HoaDon
INSERT INTO HoaDon (ID_KhachHang, ID_NhanVien, ID_KhuyenMai, TienSauGiamGia, ThanhTien, PhuongThucThanhToan, NgayThanhToan, TrangThai)
VALUES 
  (1, 3, 5, 5000000, 4500000, 1, '2024-01-20', 1),
  (2, 5, 8, 7000000, 6500000, 0, '2024-02-05', 1),
  (3, 2, 3, 3500000, 3000000, 1, '2024-03-10', 1),
  (4, 7, 10, 9000000, 8500000, 0, '2024-04-15', 1),
  (5, 1, 15, 12000000, 11500000, 1, '2024-05-20', 1),
  (2, 4, 6, 6000000, 5500000, 0, '2024-06-25', 1),
  (3, 8, 12, 8000000, 7500000, 1, '2024-07-01', 1),
  (1, 6, 9, 4500000, 4000000, 0, '2024-08-15', 1),
  (5, 2, 18, 11000000, 10500000, 1, '2024-09-20', 1),
  (4, 5, 14, 9500000, 9000000, 0, '2024-10-05', 1),
  (3, 1, 7, 3000000, 2500000, 1, '2024-11-10', 1),
  (2, 9, 20, 8500000, 8000000, 0, '2024-12-15', 1),
  (1, 4, 11, 4000000, 3500000, 1, '2025-01-20', 1),
  (5, 7, 17, 10500000, 10000000, 0, '2025-02-25', 1),
  (4, 3, 13, 7500000, 7000000, 1, '2025-03-10', 1),
  (3, 6, 16, 11500000, 11000000, 0, '2025-04-15', 1),
  (2, 1, 19, 9500000, 9000000, 1, '2025-05-20', 1),
  (1, 5, 8, 5000000, 4500000, 0, '2025-06-25', 1),
  (5, 8, 10, 8500000, 8000000, 1, '2025-07-01', 1),
  (4, 2, 15, 7000000, 6500000, 0, '2025-08-15', 1);
-- Thêm 20 dữ liệu vào bảng HoaDonChiTiet
INSERT INTO HoaDonChiTiet (ID_HoaDon, ID_ChiTietVi, SoLuong, DonGia, TrangThai)
VALUES 
  (11, 13, 2, 1500000, 1),
  (11, 14, 1, 2000000, 1),
  (12, 15, 3, 1800000, 1),
  (12, 16, 1, 2500000, 1),
  (13, 17, 2, 1200000, 1),
  (13, 18, 1, 3000000, 1),
  (14, 19, 4, 2100000, 1),
  (14, 20, 2, 1700000, 1),
  (15, 20, 1, 1800000, 1),
  (15, 2, 3, 2200000, 1),
  (16, 3, 2, 2500000, 1),
  (16, 4, 1, 1900000, 1),
  (17, 5, 4, 2000000, 1),
  (17, 6, 3, 2300000, 1),
  (18, 7, 2, 1700000, 1),
  (18, 8, 1, 2100000, 1),
  (19, 9, 3, 2200000, 1),
  (19, 3, 1, 3000000, 1),
  (20, 1, 2, 2500000, 1),
  (20, 2, 1, 1900000, 1);
  -- Thêm 20 dữ liệu vào bảng GioHang
INSERT INTO GioHang (ID_KhachHang, NgayTao, TrangThai)
VALUES 
  (1, '2024-01-15', 1),
  (2, '2024-02-20', 1),
  (3, '2024-03-25', 1),
  (4, '2024-04-30', 1),
  (5, '2024-05-05', 1),
  (1, '2024-06-10', 1),
  (2, '2024-07-15', 1),
  (3, '2024-08-20', 1),
  (4, '2024-09-25', 1),
  (5, '2024-10-30', 1),
  (1, '2024-11-05', 1),
  (2, '2024-12-10', 1),
  (3, '2025-01-15', 1),
  (4, '2025-02-20', 1),
  (5, '2025-03-25', 1),
  (1, '2025-04-30', 1),
  (2, '2025-05-05', 1),
  (3, '2025-06-10', 1),
  (4, '2025-07-15', 1),
  (5, '2025-08-20', 1);
-- Thêm 20 dữ liệu vào bảng ChiTietGioHang
INSERT INTO ChiTietGioHang (ID_GioHang, ID_ChiTietVi, SoLuong, TrangThai)
VALUES 
  (1, 3, 2, 1),
  (1, 5, 1, 1),
  (2, 8, 3, 1),
  (2, 2, 1, 1),
  (3, 1, 2, 1),
  (3, 6, 1, 1),
  (4, 9, 4, 1),
  (4, 4, 2, 1),
  (5, 7, 1, 1),
  (5, 3, 3, 1),
  (6, 2, 2, 1),
  (6, 5, 1, 1),
  (7, 10, 4, 1),
  (7, 1, 3, 1),
  (8, 4, 2, 1),
  (8, 7, 1, 1),
  (9, 3, 3, 1),
  (9, 6, 1, 1),
  (10, 8, 2, 1),
  (10, 9, 1, 1);




