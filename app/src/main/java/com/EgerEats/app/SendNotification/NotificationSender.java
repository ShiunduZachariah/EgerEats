package com.EgerEats.app.SendNotification;


public class NotificationSender {

    public Data data;
    public String to;

    public NotificationSender(Data data,String to)
    {
        this.data=data;
        this.to=to;
    }

    public NotificationSender()
    {

    }
}
