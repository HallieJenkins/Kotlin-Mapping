import java.io.File

fun main(args: Array<String>) {
    val name_str = File(args[0]).readText()
    val name_list = name_str.split("\n")
    var name_map = mutableMapOf<String, String>()
    for(name in name_list){
       var temp_list = name.split(" ")
       var initials = temp_list[0].get(0).plus("").plus(temp_list[1].get(0))
       name_map.put(initials, name)

    }
    while(true){
        try{
            print("Enter Initials: ")
            val stringInput = readLine()!!
            val query = name_map.getOrElse(stringInput.uppercase()) { "Not found" }
            println("$query")

        }
        catch(e: java.lang.NullPointerException){
            print("Goodbye! \n")
            break
        }
    }
}
