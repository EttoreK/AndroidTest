package org.example; // pacote/namespace da classe para organizar e evitar conflitos

import androidx.appcompat.app.AppCompatActivity; // compatibilidade entre versões android
import android.os.Bundle; // comunicação entre Activities
import android.widget.TextView; // componente de interface para exibir textos
// Classe pública, para ser acessada por outros. AppCompatActivity permite usar as funcionalidades de uma Activity
public class App extends AppCompatActivity {
    private MessageUtils messageUtils; // gerador de saudações
    // Inicia a classe hellowMessage para chamar a mensagem
    public void hellowMessage(MessageUtils MessageUtils){
        this.messageUtils = messageUtils; // instânia de MessageUtils
    }

    @Override // Inicio da interfae do usuários e outros componentes e acessa dados contidos pelo Bundle da instância anterior da Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // inicia a Activity corretamente com a AppCompatActivity
        displayMessage(); // chamada do método displayMessage
    }
    // Método para exibir mensagem
    private void displayMessage() {
        messageUtils = new MessageUtils(); // nova instância messageUtils
        TextView textView = new TextView(this); // instância para exibir texto na interface da Activity atual
        textView.setText(messageUtils.getMessage()); // define o texto a ser exibido
        setContentView(textView); // define o textview como conteúdo a ser exibido
    }
    // Método para pegar o valor da saudação
    public String getMessage() {
        return messageUtils.getMessage(); // valor da saudação "Hello World"
    }
}