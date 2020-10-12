package test;

import com.fc.SpringbootStart;
import com.fc.test.util.QRCodeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootStart.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class QrCodeTestCase {
    @Test
    public void createCommonQRCode() throws Exception {
        try {

            //使用工具类生成二维码
            QRCodeUtil.encode("LITER1234567", null,"D:/v2file/test.png",false);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
