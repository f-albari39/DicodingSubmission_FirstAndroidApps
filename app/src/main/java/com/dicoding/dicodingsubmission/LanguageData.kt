package com.dicoding.dicodingsubmission

object LanguageData{
    private val languageNames   = arrayOf("Python","Java","Kotlin","C","C++","Ruby","PHP","JavaScript","C#","R")
    private val languageDesc    = arrayOf(
            "Python adalah bahasa pemrograman tujuan umum yang ditafsirkan, tingkat tinggi. Dibuat oleh Guido " +
            "van Rossum dan pertama kali dirilis pada tahun 1991, filosofi desain Python menekankan keterbacaan " +
            "kode dengan penggunaan spasi putih yang signifikan.",
            "Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. " +
            "Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems saat ini " +
            "merupakan bagian dari Oracle dan dirilis tahun 1995.",
            "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual " +
            "Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript.",
            "Bahasa pemrograman C merupakan salah satu bahasa pemrograman komputer. Dibuat pada tahun 1972 oleh Dennis " +
            "Ritchie untuk Sistem Operasi Unix di Bell Telephone Laboratories. Meskipun C dibuat untuk memprogram sistem " +
            "dan jaringan komputer namun bahasa ini juga sering digunakan dalam mengembangkan software aplikasi.",
            "C++ adalah bahasa pemrograman komputer yang di buat oleh Bjarne Stroustrup, yang merupakan perkembangan " +
            "dari bahasa C dikembangkan di Bell Labs pada awal tahun 1970-an, bahasa itu diturunkan dari bahasa sebelumnya, yaitu B.",
            "Ruby adalah bahasa pemrograman dinamis berbasis skrip yang berorientasi objek. Tujuan dari ruby adalah " +
            "menggabungkan kelebihan dari semua bahasa-bahasa pemrograman skrip yang ada di dunia. Ruby ditulis " +
            "dengan bahasa pemrograman C dengan kemampuan dasar seperti Perl dan Python.",
            "PHP: Hypertext Preprocessor adalah bahasa skrip yang dapat ditanamkan atau disisipkan ke dalam HTML. " +
            "PHP banyak dipakai untuk memprogram situs web dinamis. PHP dapat digunakan untuk membangun sebuah CMS.",
            "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis. JavaScript populer di internet dan " +
            "dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer, " +
            "Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag SCRIPT.",
            "C# merupakan sebuah bahasa pemrograman yang berorientasi objek yang dikembangkan oleh Microsoft sebagai " +
            "bagian dari inisiatif kerangka .NET Framework.",
            "R adalah bahasa pemrograman dan perangkat lunak untuk analisis statistika dan grafik. R dibuat oleh " +
            "Ross Ihaka dan Robert Gentleman di Universitas Auckland, Selandia Baru, dan kini dikembangkan oleh " +
            "R Development Core Team, di mana Chambers merupakan anggotanya."
        )
    private val languageImage   = intArrayOf(
            R.drawable.logo_python,
            R.drawable.logo_java,
            R.drawable.logo_kotlin,
            R.drawable.logo_c,
            R.drawable.logo_cpp,
            R.drawable.logo_ruby,
            R.drawable.logo_php,
            R.drawable.logo_javascript,
            R.drawable.logo_csharp,
            R.drawable.logo_r
        )

    val listData: ArrayList<Language>
        get() {
            val list = arrayListOf<Language>()
            for (position in languageNames.indices) {
                val lang            = Language()
                lang.name           = languageNames[position]
                lang.description    = languageDesc[position]
                lang.image          = languageImage[position]
                list.add(lang)
            }
            return list
        }
}