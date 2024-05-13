package com.infinitelearning.infiniteapp.data

import com.infinitelearning.infiniteapp.R
import com.infinitelearning.infiniteapp.model.Koleksi
import com.infinitelearning.infiniteapp.model.Produk
import com.infinitelearning.infiniteapp.model.Vendor

object DummyData {
    val mobileVendor = listOf(
        Vendor(
            id = 1,
            name = "Unilever",
            address = "Cikarang Bekasi",
            Telephone = 12124567,
            photo = R.drawable.unilever
        ),
        Vendor(
            id = 2,
            name = "Indofood",
            address = "Cikarang Bekasi",
            Telephone = 124565,
            photo = R.drawable.indofood
        ),
        Vendor(
            id = 3,
            name = "Wings Food",
            address = "Cikarang Bekasi",
            Telephone = 1484545,
            photo = R.drawable.wings
        ),
        Vendor(
            id = 4,
            name = "Mayora",
            address = "Bekasi",
            Telephone = 1484545,
            photo = R.drawable.mayora
        ),
        Vendor(
            id = 5,
            name = "Sedap",
            address = "Jakarta Utara",
            Telephone = 1484545,
            photo = R.drawable.sedapmie
        ),
        Vendor(
            id = 6,
            name = "AQUA",
            address = "Bekasi",
            Telephone = 1484545,
            photo = R.drawable.aqua
        ),
        Vendor(
            id = 7,
            name = "Ajinomoto",
            address = "Karawang",
            Telephone = 1484545,
            photo = R.drawable.ajinomoto
        ),
        Vendor(
            id = 8,
            name = "Indomie",
            address = "Cikarang Bekasi",
            Telephone = 1484545,
            photo = R.drawable.logoindomie
        ),
        Vendor(
            id = 9,
            name = "Garuda Indonesia",
            address = "Cikarang Bekasi",
            Telephone = 1484545,
            photo = R.drawable.garuda
        ),
        Vendor(
            id = 10,
            name = "Orang Tua",
            address = "Cikarang Bekasi",
            Telephone = 1484545,
            photo = R.drawable.orangtua
        )
    )
    val mobileProduk = listOf(
        Produk(
            id = 1,
            name = "Indomie Goreng",
            photo = R.drawable.indomiegoreng,
            Variant = "Goreng",
            Keterangan = "Mi goreng yang lezat dan nikmat, terbuat dari bahan berkualitas dan rempah rempah terbaik.",
            Harga = " Rp. 3500"
        ),
        Produk(
            id = 2,
            name = "Indomie Kuah Soto",
            photo = R.drawable.indomiekuahsoto,
            Variant = "Kuah",
            Keterangan = "Mi bulat dan kenyal. Kuahnya segar dengan sensasi rasa jeruk limau kuit, menjadikan rasa sotonya berbeda dan memberikan kehangatan saat menyantapnya",
            Harga = " Rp. 3400"
        ),
        Produk(
            id = 3,
            name = "Indomie Goreng Cabe ijo",
            photo = R.drawable.idngrngcabeijo,
            Variant = "Goreng",
            Keterangan = "",
            Harga = " Rp. 4000",
        ),
        Produk(
            id = 4,
            name = "Indomie Goreng Rendang",
            photo = R.drawable.indomierendang,
            Variant = "Goreng",
            Keterangan = "",
            Harga = " Rp. 3700"
        ),
        Produk(
            id = 5,
            name = "Indomie Spesial Chicken",
            photo = R.drawable.indomiespclchiken,
            Variant = "Kuah",
            Keterangan = "",
            Harga = " Rp. 3800"
        ),
        Produk(
            id = 6,
            name = "Mie Sedap Soto",
            photo = R.drawable.sdpsoto,
            Variant = "Kuah",
            Keterangan = "",
            Harga = " Rp. 3200"
        ),
        Produk(
            id = 7,
            name = "Mie Sedap Baso",
            photo = R.drawable.sedapbaso,
            Variant = "Kuah",
            Keterangan = "",
            Harga = " Rp. 3300"
        ),
        Produk(
            id = 8,
            name = " Mie Sedap Baso Cup",
            photo = R.drawable.sedapbasocup,
            Variant = "Kuah",
            Keterangan = "",
            Harga = " Rp. 3500"
        ),
        Produk(
            id = 9,
            name = "Mie Sedap Goreng",
            photo = R.drawable.sedapgoreng,
            Variant = "Goreng",
            Keterangan = "",
            Harga = " Rp. 3900"
        ),
        Produk(
            id = 10,
            name = "Mie Sedap WhiteCurry",
            photo = R.drawable.sedapwhitecurry,
            Variant = "Kuah",
            Keterangan = "",
            Harga = " Rp. 4000"
        )
    )

    val Koleksi = listOf(
        Koleksi(
            id = 1,
            name = "Mie Sedap WhiteCurry",
            photo = R.drawable.sedapwhitecurry,
            Variant = "Kuah",
            Keterangan = ""
        ),
        Koleksi(
            id = 2,
            name = "Mie Sedap Baso",
            photo = R.drawable.sedapbaso,
            Variant = "Kuah",
            Keterangan = "",
        ),
        Koleksi(
            id = 3,
            name = "Indomie Kuah Soto",
            photo = R.drawable.indomiekuahsoto,
            Variant = "Kuah",
            Keterangan = "",
        ),
        Koleksi(
            id = 4,
            name = "Indomie Goreng",
            photo = R.drawable.indomiegoreng,
            Variant = "Mananan",
            Keterangan = "",
        ),
        Koleksi(
            id = 5,
            name = "Aqua Botol",
            photo = R.drawable.aquabotol,
            Variant = "Minuman",
            Keterangan = "",
        ),
        Koleksi(
            id = 6,
            name = "Kacang Garuda Rosta",
            photo = R.drawable.kacang,
            Variant = "Makanan",
            Keterangan = "",
        ),
        Koleksi(
            id = 7,
            name = "Ale-Ale Anggur",
            photo = R.drawable.alealeanggur,
            Variant = "Minuman",
            Keterangan = "Mi goreng yang lezat dan nikmat, terbuat dari bahan berkualitas dan rempah rempah terbaik.",
        ),
        Koleksi(
            id = 8,
            name = "Ale-Ale Mangga",
            photo = R.drawable.aleale,
            Variant = "Minuman",
            Keterangan = "",
        ),
        Koleksi(
            id = 9,
            name = "Garuda Kacang Pedas",
            photo = R.drawable.garudakacangpedas,
            Variant = "Makanan",
            Keterangan = "",
        ),
        Koleksi(
            id = 10,
            name = "Garuda Pilus Sapi Panggang",
            photo = R.drawable.garudapilussapipanggang,
            Variant = "Makanan",
            Keterangan = "",
        )
    )
}