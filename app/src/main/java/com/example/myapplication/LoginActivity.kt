package com.example.myapplication

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.layoutManager = LinearLayoutManager(this)
        list.hasFixedSize()
        list.adapter = ListAdapter(applicationContext, getLists())

    }

    fun getLists(): ArrayList<String> {
        var lists = ArrayList<String>()
        lists.add("Ha Noi")

        return lists;
    }
}
