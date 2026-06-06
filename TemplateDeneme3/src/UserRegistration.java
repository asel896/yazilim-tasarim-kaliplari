public abstract class UserRegistration {
    public final void registerUser(){
        getFormData();
        validateData();
        saveToDatabase();
        sendNotification();
    }

    private void getFormData(){
        System.out.println("Form verileri alındı.");
    }

    private void saveToDatabase(){
        System.out.println("Notification send.");
    }
    protected abstract void validateData();
    protected abstract void sendNotification();
}

class PremiumUserRegistration extends UserRegistration {
    @Override
    protected void validateData() {
        System.out.println("Premium kullanıcı için ek güvenlik kontrolleri yapıldı.");
    }
    @Override
    protected void sendNotification() {
        System.out.println("Premium kullanıcıya hoş geldin HEDİYE KUPONU ve SMS gönderildi.");
    }
}