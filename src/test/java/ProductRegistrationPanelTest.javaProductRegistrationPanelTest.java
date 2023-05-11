import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductRegistrationPanelTest {

    @Mock
    private JTextField buyPriceField;

    @Mock
    private JTextField revenueField;

    @Mock
    private JTextField sellPriceField;

    @Mock
    private JButton submitButton;

    @Test
    void testCalculateSellPrice() {
        // given
        var productRegistrationPanel = new ProductRegistrationPanel();
        productRegistrationPanel.setBuyPriceField(buyPriceField);
        productRegistrationPanel.setRevenueField(revenueField);
        productRegistrationPanel.setSellPriceField(sellPriceField);
        productRegistrationPanel.setSubmitButton(submitButton);

        var buyPrice = 100.0;
        var revenuePercentage = 20.0;
        var expectedSellPrice = 125.0;

        // when
        buyPriceField.setText(String.valueOf(buyPrice));
        revenueField.setText(String.valueOf(revenuePercentage));
        submitButton.doClick();

        // then
        assertEquals(expectedSellPrice, Double.parseDouble(sellPriceField.getText()), 0.01);
    }
}


