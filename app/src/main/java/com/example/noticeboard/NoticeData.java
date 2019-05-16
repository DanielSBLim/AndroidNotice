package com.example.noticeboard;

public class NoticeTitle {

    private String  title       = "";
    private String  titleWriter = "";
    private int     titleNumber = 0;

    NoticeTitle(int getTitleNumber, String getTitle, String getTitleWriter) {
        this.titleNumber    = getTitleNumber;
        this.title          = getTitle;
        this.titleWriter    = getTitleWriter;
    }

}

//        [형서기] [오후 11:00] 클래스하나만들어서
//        [형서기] [오후 11:00] 그안에 String 두개, int 한개
//        [형서기] [오후 11:00] 이렇게 만들어
//        [형서기] [오후 11:00] 그럼 스트링한개는 제목
//        [형서기] [오후 11:00] 한개는 작성자
//        [형서기] [오후 11:00] 인트는 넘버
//        [형서기] [오후 11:00] 요렇게
//        [형서기] [오후 11:01] 클래스이름은 NoticeData 정도면 되겠고
//        [형서기] [오후 11:02] 그럼이제 어레이리스트를 만들때 string 한개만 세팅하는게 아니고
//        [형서기] [오후 11:02] ArrayList<NoticeData> 로 만들어서
//        [형서기] [오후 11:02] 저 리스트 한개당 게시물 한개가 되는거야
//        [형서기] [오후 11:03] NoticeData에다 각각 임의에 데이터를 입력해서
//        [형서기] [오후 11:03] 어레이 리스트에 넣어
//        [형서기] [오후 11:03] 그 어레이리스트를 아답터에 붙일거니까
//        [형서기] [오후 11:03] 당연히 아답터도 ArrayList<NoticeData> 가 되도록 해야겠지?
//        [형서기] [오후 11:04] 그리고 아답터 안에 뷰를 가지고있는게 ViewHolder인데 얘도 String이 아니라 NoticeData를 가지도록 해야겠지?