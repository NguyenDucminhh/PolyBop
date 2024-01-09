CREATE DATABASE PoLyBop 
GO 

USE PoLyBop
GO 

-- Tạo bảng 
CREATE TABLE [Loai vi] (
  [IDlLoaiVi] INT IDENTITY,
  [TenLoaiVi] Nvarchar(50),
  [TrangThai] BIT,
  PRIMARY KEY ([IDlLoaiVi])
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
      REFERENCES [Loai vi]([IDlLoaiVi]),
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

