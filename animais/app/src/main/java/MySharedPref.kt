import android.content.Context
import android.content.SharedPreferences


class MySharedPref(context: Context, keySp: String) {

    private val sp: SharedPreferences =
        context.getSharedPreferences(keySp, Context.MODE_PRIVATE)

    fun setString(key: String, str: String) {
        sp.edit().putString(key, str).apply()
    }

    fun getString(key: String): String {
        return sp.getString(key, "") ?: ""
    }
}
