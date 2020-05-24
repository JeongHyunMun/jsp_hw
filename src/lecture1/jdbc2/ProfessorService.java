package lecture1.jdbc2;

import lecture1.util.StringUtil;

public class ProfessorService {

    static final String ID_�ʼ� = "ID�� �Է��ϼ���";
    static final String ����_�ʼ� = "������ �Է��ϼ���";
    static final String ID_�ߺ� = "ID�� �ߺ��˴ϴ�";


    public static String validate(Professor professor) throws Exception {
        if (StringUtil.isEmptyOrBlank(String.valueOf(professor.getId())))
            return ID_�ʼ�;
        if (StringUtil.isEmptyOrBlank(professor.getProfessorName()))
            return ����_�ʼ�;
        Professor professor1 = ProfessorDAO.findById(professor.getId());
        if (professor1 != null && professor1.getId() != professor.getId())
            return ID_�ߺ�;
        return null;
    }
    public static String validateBeforeInsert(Professor professor) throws Exception {
        String errorMessage = validate(professor);
        if (errorMessage != null) return errorMessage;
        if (ProfessorDAO.findById(professor.getId()) != null)
            return "ID�� �ߺ��˴ϴ�.";
        return null;
    }

    public static String insert(Professor professor) throws Exception {
        String errorMessage = validate(professor);
        if (errorMessage != null) return errorMessage;
        ProfessorDAO.insert(professor);
        return null;
    }

    public static String update(Professor professor) throws Exception {
        String errorMessage = validate(professor);
        if (errorMessage != null) return errorMessage;
        ProfessorDAO.update(professor);
        return null;
    }
}
