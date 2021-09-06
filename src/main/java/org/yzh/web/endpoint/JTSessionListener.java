package org.yzh.web.endpoint;

import io.github.yezhihao.netmc.session.Session;
import io.github.yezhihao.netmc.session.SessionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.yzh.web.mapper.DeviceMapper;
import org.yzh.web.model.enums.SessionKey;
import org.yzh.web.model.vo.DeviceInfo;

public class JTSessionListener implements SessionListener {

    @Autowired
    private DeviceMapper deviceMapper;

    @Override
    public void sessionCreated(Session session) {
    }

    @Override
    public void sessionRegistered(Session session) {
        DeviceInfo device = SessionKey.getDeviceInfo(session);
        if (device != null)
            deviceMapper.deviceOnline(device.getDeviceId(), true);
    }

    @Override
    public void sessionDestroyed(Session session) {
        DeviceInfo device = SessionKey.getDeviceInfo(session);
        if (device != null)
            deviceMapper.deviceOnline(device.getDeviceId(), false);
    }
}