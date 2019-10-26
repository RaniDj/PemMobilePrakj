package com.example.presidenri

import getset //untuk meng import kelas Getsetarray

object dataArray {
    //untuk menampung data array

    //muntuk mendeklarasikan listOf()string
    private val languages = listOf("Soekarno","Syafrudin","Soeharto", "Habibie", "Gusdur",
        "Megawati","Susilo Bambang Yudhoyono","Jokowi WiDodo")

    val desk = listOf( // untuk mengisi listOF pada variabel desk atau deskripsi
        "Soekarno adalah Presiden Pertama nama lahir: Koesno Sosrodihardjo) (lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun) adalah Presiden Indonesia pertama yang menjabat pada periode 1945–1966. Ia memainkan peran yang penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Ia adalah Proklamator Kemerdekaan Indonesia (bersama dengan Mohammad Hatta) yang terjadi pada tanggal 17 Agustus 1945. Soekarno adalah yang pertama kali mencetuskan konsep mengenai Pancasila sebagai dasar negara Indonesia dan ia sendiri yang menamainya.",
        "Soeharto adalah Presiden ke-dua Indonesia yang menjabat dari tahun 1967 sampai 1998, menggantikan Soekarno. Di dunia internasional, terutama di Dunia Barat, Soeharto sering dirujuk dengan sebutan populer \"The Smiling General\" (bahasa Indonesia: \"Sang Jenderal yang Tersenyum\") karena raut mukanya yang selalu tersenyum.",
        "Habibie adalah Presiden Republik Indonesia yang ke-3. Ia menggantikan Soeharto yang mengundurkan diri dari jabatan presiden pada tanggal 21 Mei 1998. Jabatannya digantikan oleh Abdurrahman Wahid (Gus Dur) yang terpilih sebagai presiden pada 20 Oktober 1999 oleh MPR hasil Pemilu 1999. Dengan menjabat selama 2 bulan dan 7 hari sebagai wakil presiden, dan 1 tahun dan 5 bulan sebagai presiden, Habibie merupakan Wakil Presiden dan juga Presiden Indonesia dengan masa jabatan terpendek.",
        "Gusdur adalah Presiden Indonesia yang ke-4 dari tahun 1999 hingga 2001. Ia menggantikan Presiden B.J. Habibie setelah dipilih oleh Majelis Permusyawaratan Rakyat hasil Pemilu 1999. Penyelenggaraan pemerintahannya dibantu oleh Kabinet Persatuan Nasional. Masa kepresidenan Abdurrahman Wahid dimulai pada 20 Oktober 1999 dan berakhir pada Sidang Istimewa MPR pada tahun 2001. Tepat 23 Juli 2001, ",
        "Megawati Soekarno Putri adalah Presiden Indonesia yang ke-5 yang menjabat sejak 23 Juli 2001 — 20 Oktober 2004. Ia merupakan presiden wanita Indonesia pertama dan anak dari presiden Indonesia pertama, Soekarno, yang kemudian mengikuti jejak ayahnya menjadi Presiden Indonesia. Pada 20 September 2004, ia kalah suara dari Susilo Bambang Yudhoyono dalam Pemilu Presiden 2004 putaran yang kedua.",
        "Susilo Bambang Yudhoyono adalah  Presiden Indonesia ke-6 yang menjabat sejak 20 Oktober 2004 hingga 20 Oktober 2014. Ia, bersama Wakil Presiden Muhammad Jusuf Kalla, terpilih dalam Pemilu Presiden 2004. Ia berhasil melanjutkan pemerintahannya untuk periode kedua dengan kembali memenangkan Pemilu Presiden 2009, kali ini bersama Wakil Presiden Boediono.",
        "Joko Widodo adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014. Ia terpilih bersama Wakil Presiden Muhammad Jusuf Kalla dalam Pemilu Presiden 2014. Jokowi pernah menjabat Gubernur DKI Jakarta sejak 15 Oktober 2012 sampai dengan 16 Oktober 2014 didampingi Basuki Tjahaja Purnama sebagai wakil gubernur."
    )

    private val pictDat = intArrayOf( //untuk mendeklarasikan gambar harus menggunakan IntArrayOf()
        R.drawable.bung_karno,//untuk memanggil gambar pada drawlable
        R.drawable.syafrudin,
        R.drawable.habibie,
        R.drawable.soeharto,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listData: ArrayList<getset> //mengoper data pada class GetSetArray
        get() {
            val list = arrayListOf<getset>()  //mendeklarasikan data array sebagai list
            for (position in languages.indices) { //perulangan untuk mengisi data ke GetSetArray
                val listDat = getset()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list //mengembalikan data untuk mengirim ke GetSetArray
        }
}