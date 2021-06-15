package org.yzh.protocol.t1078;

import io.github.yezhihao.netmc.core.model.Response;
import io.github.yezhihao.protostar.DataType;
import io.github.yezhihao.protostar.annotation.Field;
import io.github.yezhihao.protostar.annotation.Message;
import org.yzh.protocol.basics.JTMessage;
import org.yzh.protocol.commons.JT1078;

/**
 * @author yezhihao
 * @home https://gitee.com/yezhihao/jt808-server
 */
@Message(JT1078.文件上传完成通知)
public class T1206 extends JTMessage implements Response {

    private int responseSerialNo;
    private int result;

    @Field(index = 0, type = DataType.WORD, desc = "应答流水号")
    public int getResponseSerialNo() {
        return responseSerialNo;
    }

    public void setResponseSerialNo(int responseSerialNo) {
        this.responseSerialNo = responseSerialNo;
    }

    @Field(index = 2, type = DataType.BYTE, desc = "结果: 0.成功 1.失败")
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
