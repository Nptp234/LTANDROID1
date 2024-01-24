package ClassObject;

public class User {
    String _name, _pass, _phone;

    public User(){ }

    public User(String _name, String _pass, String _phone) {
        this._name = _name;
        this._pass = _pass;
        this._phone = _phone;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_pass() {
        return _pass;
    }

    public void set_pass(String _pass) {
        this._pass = _pass;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }
}
