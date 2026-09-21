import java.util.ArrayList;

public class HistorialNavegacion {
    private static final int LIMITE_HISTORIAL = 10;
    private final ArrayList<String> historial = new ArrayList<>();

    public void visitarPagina(String url) {
        historial.add(url);

        if (historial.size() > LIMITE_HISTORIAL) {
            historial.remove(0);
        }
    }
}