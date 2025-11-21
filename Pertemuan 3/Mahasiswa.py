# Nama : Salma Adiba Chasani
# NIM  : 32602400123

class Mahasiswa:
    def __init__(self):
        self.__nama = None
        self.__nim = None

    # Getter & Setter Nama
    def get_nama(self):
        return self.__nama

    def set_nama(self, nama):
        self.__nama = nama

    # Getter & Setter NIM dengan validasi
    def get_nim(self):
        return self.__nim

    def set_nim(self, nim):
        if isinstance(nim, str) and nim.isdigit() and len(nim) == 10:
            self.__nim = nim
        else:
            raise ValueError("NIM harus 10 digit angka!")

# === PROGRAM UTAMA ===
m = Mahasiswa()

m.set_nama(input("Masukkan Nama: "))

valid = False
while not valid:
    try:
        nim = input("Masukkan NIM (10 digit): ")
        m.set_nim(nim)
        valid = True
    except ValueError as e:
        print(e)

print("\n=== DATA MAHASISWA ===")
print("Nama:", m.get_nama())
print("NIM :", m.get_nim())
