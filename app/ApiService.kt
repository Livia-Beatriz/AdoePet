import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("tarefas")
    fun listarTarefas(): Call<List<Tarefa>>
}
