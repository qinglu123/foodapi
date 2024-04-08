package cn.bdqn.enums;

public enum OrderStatus {
    ORDERED("已下单",1),
    CANCEL("取消订单",2),
    WAITING("待收货",3),
    RECEIVED("已收货",4);

    private String content;//保存枚举值的含义
    private int num; //保存枚举值的数值

    OrderStatus(String content, int num) {
        this.content = content;
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
