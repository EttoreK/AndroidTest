package org.example; // pacote/namespace da classe para organizar e evitar conflitos

import org.testng.annotations.*; // anotações do TestNG
import static org.testng.Assert.*; // métodos para verificar condições 
// classe de testes 
public class AppTest {
    
    @Test // declaração de método de teste para verificar a saudação
    public void messageIsCorrect() {
        MessageUtils message = new MessageUtils(); // nova instância do gerador de saudação
        assertEquals("Hello, World!", message.getMessage()); // verifica se está retornando corretamente 
    }
}