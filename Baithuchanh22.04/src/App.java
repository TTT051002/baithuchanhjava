import Student.OfflineStudent;
import Student.OnlineStudent;

public class App1 {
    public static void main(String[] args) {
        OfflineStudent st = new OfflineStudent();
        st.nhap();
        st.nhapTrangThai();

        OnlineStudent st2 = new OnlineStudent();
        st2.nhap();
        st2.nhapTrangThai();

        st.xuatLoaiSV();
        st.inHoten();
        st.inTuoi();
        st.inTrangThai();

        st2.xuatLoaiSV();
        st2.inHoten();
        st2.inTuoi();
        st2.inTrangThai();
    }
}