package oop.inheritance;

import oop.inheritance.Application;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;

public class MainTest {

    @Test
    public void when1IsTyped_thenDoSaleIsCalled() {

        //Given
        Application application = mock(Application.class);
        when(application.readKey()).thenReturn("1");

        //when
        Main.run(application);

        //Then
        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).doSale();

        verifyNoMoreInteractions(application);

    }

    @Test
    public void when2IsTyped_thenDoRefundIsCalled() {

        //Given
        Application application = mock(Application.class);
        when(application.readKey()).thenReturn("2");

        //when
        Main.run(application);

        //Then
        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).doRefund();

        verifyNoMoreInteractions(application);

    }

    @Test
    public void when3IsTyped_thenPrintReportIsCalled() {

        //Given
        Application application = mock(Application.class);
        when(application.readKey()).thenReturn("3");

        //when
        Main.run(application);

        //Then
        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).printReport();

        verifyNoMoreInteractions(application);

    }

    @Test
    public void when4IsTyped_thenShowConfigurationIsCalled() {

        //Given
        Application application = mock(Application.class);
        //ArgumentCaptor<String> param = ArgumentCaptor.forClass(String.class);

        when(application.readKey()).thenReturn("4");

        //when
        Main.run(application);

        //Then
        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).showConfiguration();
        //verify(application).showConfiguration(param.capture());

        verifyNoMoreInteractions(application);

    }
}
