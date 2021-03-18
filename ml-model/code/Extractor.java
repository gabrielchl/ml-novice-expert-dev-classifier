package dev.gabrielchl.extractor;

import com.github.javaparser.ParseProblemException;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.comments.BlockComment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.CastExpr;
import com.github.javaparser.ast.expr.UnaryExpr;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class Extractor {
    public static void main(String[] args) throws FileNotFoundException {

        String[] novices = {
            "17pa1a05g0",
            "1rn18cs078racha1",
            "Aftaab99",
            "AnasMikel",
            "AnshJaiswal",
            "Antor_Saha",
            "AryaYunanta",
            "Baggins_9t9",
            "BornInsane",
            "CENG190709062",
            "ChallaMahendar",
            "M2Kishore",
            "Mohamed_Metwalli",
            "Prateek_Jakhar10",
            "Rishavkalra2001",
            "Thiwanka_silva11",
            "Vm_Pandey",
            "_hsay_",
            "abhishekjais22",
            "adizcode",
            "aginton3",
            "akashv5482",
            "akhil3041999",
            "aliakbar014",
            "amitzope2000",
            "andrescalderon55",
            "anikettiwari99",
            "anshu_the_pro",
            "arpit_agarwal24",
            "avnishmaurya182",
            "ayanmukherjee201",
            "ayushgour9413991",
            "ayushisomkuvar21",
            "bhangemehul",
            "bhuvangarg123",
            "biswajeetparida1",
            "cgaanesan",
            "chiragbatra64",
            "chris_yun_986",
            "codemachine69",
            "divanshujoshi_a1",
            "dtemir",
            "dvishal35",
            "dwivedivedbrat",
            "dx_apoorv",
            "eyupOkur",
            "fatihasa96",
            "gannavarapu_sak1",
            "gaurav_sahal10",
            "gauravpriyanshu3",
            "gokul_nairmurali",
            "gupta_aanshik",
            "h170031187",
            "harshdeep1699",
            "hridayesh11",
            "iamsoumik",
            "jainendra_p19",
            "jeet_kej",
            "jisumaji",
            "jugal18kundaliya",
            "jwalaeswar",
            "jyoti369",
            "kirito04",
            "kunalpatrikar25",
            "kushal_p1699",
            "laxminarayanaya1",
            "leosaugusto98",
            "loknathsingh998",
            "manusingla000",
            "marmikmundada",
            "mauryasunil",
            "mayankmanish227",
            "me_noob_21"
        };

        String[] experts = {
            "Abhibpl26",
            "Albert_Shi",
            "HrishabKumar",
            "Partha_PPM",
            "QVINTILIANVS",
            "Sandeep_mani",
            "Waleed_Ansari",
            "aakash992008",
            "abzalsahitov",
            "afshar_moj",
            "ainajain1993",
            "ajitdev381",
            "akankshakumari31",
            "akbarbudiman01",
            "alisharath",
            "aminmb",
            "andrea_falivene",
            "annairahurnaus",
            "arazmj",
            "ardaaksoydan",
            "arnab0812",
            "arul_shaijan",
            "asakshaysharma91",
            "ashu_goyal1997",
            "atul_shivade",
            "atulsingh1717",
            "bhavinp",
            "bhushangoel91",
            "bob_stubbs_hb",
            "btasdemir",
            "bziman",
            "caa0601",
            "chowdhuryaritra",
            "chucklan",
            "coolguy1623",
            "daolavi",
            "dedeepya_pothka1",
            "deepakdhaka1993",
            "dileeps861",
            "dimitrie_angele1",
            "dinhtienloc1996",
            "diptarka1994",
            "dk_kar369",
            "dshree217",
            "e_krishnan1",
            "elijah_a_mike",
            "everythingispos1",
            "ezeh1693",
            "fletcher_pete",
            "forestforestoff",
            "ganesankrishnan",
            "gcipgcu",
            "ghnipunasaranga",
            "gianfrancoverro1",
            "glasierrvlas",
            "gowdapraveen32",
            "gulshank2016",
            "gyanjd",
            "hardeeps986",
            "harold_mallari",
            "hedifeki1996",
            "hosni_amr95",
            "i_fazil89",
            "iamvishnusoni",
            "isha_vyas4",
            "itoohue1",
            "jackguan",
            "jaideepkurapati",
            "jefm206",
            "jgrodrigueza",
            "jimstroming",
            "jypark404",
            "kanchanshirke_ks",
            "kapish_kaps",
            "kh_m_umerjavaid",
            "kiransairavi",
            "kkabilanshiva",
            "kkgweerasekara",
            "kkrbharat14",
            "kumarbinay999",
            "kunal_kworld",
            "legiec_mateusz",
            "lisandro_delia",
            "m_zohaib1",
            "macminhhoang97",
            "maluberian",
            "mariLiis",
            "marianobonatti",
            "matiheimann",
            "mdtanvirhossain",
            "mequannint_zeru"
        };

        File[] files = new File("files/set40").listFiles();

        for (File file : files) {

            int nov_exp_indicator;

            if (Arrays.asList(novices).contains(file.getName().replace(".java", ""))) {
                nov_exp_indicator = 0;
            } else if (Arrays.asList(experts).contains(file.getName().replace(".java", ""))) {
                nov_exp_indicator = 1;
            } else {
                continue;
            }

            try {
                CompilationUnit cu = StaticJavaParser.parse(file);

                BufferedReader reader = new BufferedReader(new FileReader(file));
                int lines = 0;
                int empty_lines = 0;
                String line;
                try {
                    while ((line = reader.readLine()) != null) {
                        lines++;
                        if (line.trim().equals("")) {
                            empty_lines++;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                VoidVisitor<?> lineCommentHandler = new LineCommentHandler();
                lineCommentHandler.visit(cu, null);

                VoidVisitor<?> blockCommentHandler = new BlockCommentHandler();
                blockCommentHandler.visit(cu, null);

                VoidVisitor<?> javadocCommentHandler = new JavadocCommentHandler();
                javadocCommentHandler.visit(cu, null);

                VoidVisitor<?> variableHandler = new VariableHandler();
                variableHandler.visit(cu, null);

                VoidVisitor<?> ifHandler = new IfHandler();
                ifHandler.visit(cu, null);

                VoidVisitor<?> forHandler = new ForHandler();
                forHandler.visit(cu, null);

                VoidVisitor<?> doHandler = new DoHandler();
                doHandler.visit(cu, null);

                VoidVisitor<?> whileHandler = new WhileHandler();
                whileHandler.visit(cu, null);

                VoidVisitor<?> castHandler = new CastHandler();
                castHandler.visit(cu, null);

                VoidVisitor<?> methodHandler = new MethodHandler();
                methodHandler.visit(cu, null);

               System.out.printf(
                       "%s,%d,%d,%d,%d,%d,%d,%f,%d,%d,%d,%d,%d,%f,%d%n",
                       file.getName(),
                       lines,
                       empty_lines,
                       ((LineCommentHandler) lineCommentHandler).counter,
                       ((BlockCommentHandler) blockCommentHandler).counter,
                       ((JavadocCommentHandler) javadocCommentHandler).counter,
                       ((VariableHandler) variableHandler).counter,
                       ((VariableHandler) variableHandler).get_avg_len(),
                       ((IfHandler) ifHandler).counter,
                       ((ForHandler) forHandler).counter,
                       ((DoHandler) doHandler).counter,
                       ((WhileHandler) whileHandler).counter,
                       ((CastHandler) castHandler).counter,
                       ((MethodHandler) methodHandler).get_avg_complexity(),
                       nov_exp_indicator
               );

                VoidVisitor<?> halsteadUnaryHandler = new HalsteadUnaryHandler();
                halsteadUnaryHandler.visit(cu, null);

                VoidVisitor<?> halsteadAssignHandler = new HalsteadAssignHandler();
                halsteadAssignHandler.visit(cu, null);

                VoidVisitor<?> halsteadBinaryHandler = new HalsteadBinaryHandler();
                halsteadBinaryHandler.visit(cu, null);

                LinkedList<String> unaryOperators = ((HalsteadUnaryHandler) halsteadUnaryHandler).operators;
                LinkedList<String> unaryOperands = ((HalsteadUnaryHandler) halsteadUnaryHandler).operands;
                LinkedList<String> assignOperators = ((HalsteadAssignHandler) halsteadAssignHandler).operators;
                LinkedList<String> assignOperands = ((HalsteadAssignHandler) halsteadAssignHandler).operators;
                LinkedList<String> binaryOperators = ((HalsteadBinaryHandler) halsteadBinaryHandler).operators;
                LinkedList<String> binaryOperands = ((HalsteadBinaryHandler) halsteadBinaryHandler).operators;

                int num_dist_operators = new HashSet<>(unaryOperators).toArray(new String[0]).length +
                        new HashSet<>(assignOperators).toArray(new String[0]).length +
                        new HashSet<>(binaryOperators).toArray(new String[0]).length;
                int num_dist_operands = new HashSet<>(unaryOperands).toArray(new String[0]).length +
                        new HashSet<>(assignOperators).toArray(new String[0]).length +
                        new HashSet<>(binaryOperands).toArray(new String[0]).length;
                int num_all_operators = unaryOperators.size() + assignOperators.size() + binaryOperators.size();
                int num_all_operands = unaryOperands.size() + assignOperands.size() + binaryOperands.size();

                int halsteadVocab = num_dist_operators + num_dist_operands;
                int halsteadLen = num_all_operators + num_all_operands;
                double halsteadEstLen = num_dist_operators * Math.log(num_dist_operators) / Math.log(2) + num_all_operands * Math.log(num_all_operands) / Math.log(2);
                double halsteadVol = halsteadLen * Math.log(halsteadVocab) / Math.log(2);
                double halsteadDiff = num_dist_operators / 2f * num_all_operands / num_dist_operands;
                double halsteadEffort = halsteadDiff * halsteadVol;

//                    System.out.printf(
//                            "%s,%d,%d,%f,%f,%f,%f,%d%n",
//                            file.getName(),
//                            halsteadVocab,
//                            halsteadLen,
//                            halsteadEstLen,
//                            halsteadVol,
//                            halsteadDiff,
//                            halsteadEffort,
//                            i
//                    );

                // System.out.printf(
                //         "%s,%d,%d,%d,%d,%d,%d,%f,%d,%d,%d,%d,%d,%f,%d,%d,%f,%f,%f,%f,%d%n",
                //         file.getName(),
                //         lines,
                //         empty_lines,
                //         ((LineCommentHandler) lineCommentHandler).counter,
                //         ((BlockCommentHandler) blockCommentHandler).counter,
                //         ((JavadocCommentHandler) javadocCommentHandler).counter,
                //         ((VariableHandler) variableHandler).counter,
                //         ((VariableHandler) variableHandler).get_avg_len(),
                //         ((IfHandler) ifHandler).counter,
                //         ((ForHandler) forHandler).counter,
                //         ((DoHandler) doHandler).counter,
                //         ((WhileHandler) whileHandler).counter,
                //         ((CastHandler) castHandler).counter,
                //         ((MethodHandler) methodHandler).get_avg_complexity(),
                //         halsteadVocab,
                //         halsteadLen,
                //         halsteadEstLen,
                //         halsteadVol,
                //         halsteadDiff,
                //         halsteadEffort,
                //         i
                // );
            } catch (ParseProblemException e) {
               System.out.println(file.getName());
            }
        }
    }

    private static class HalsteadUnaryHandler extends VoidVisitorAdapter<Void> {
        public LinkedList<String> operators = new LinkedList<>();
        public LinkedList<String> operands = new LinkedList<>();

        @Override
        public void visit(UnaryExpr n, Void arg) {
            super.visit(n, arg);
//            System.out.println(n);
//            System.out.println(n.getOperator());
//            System.out.println(n.getExpression());
            operators.add(n.getOperator().toString());
            operands.add(n.getExpression().toString());
        }
    }

    private static class HalsteadAssignHandler extends VoidVisitorAdapter<Void> {
        public LinkedList<String> operators = new LinkedList<>();
        public LinkedList<String> operands = new LinkedList<>();

        @Override
        public void visit(AssignExpr n, Void arg) {
            super.visit(n, arg);
//            System.out.println(n);
//            System.out.println(n.getOperator());
//            System.out.println(n.getTarget());
//            System.out.println(n.getValue());
            operators.add(n.getOperator().toString());
            operands.add(n.getTarget().toString());
            operands.add(n.getValue().toString());
        }
    }

    private static class HalsteadBinaryHandler extends VoidVisitorAdapter<Void> {
        public LinkedList<String> operators = new LinkedList<>();
        public LinkedList<String> operands = new LinkedList<>();

        @Override
        public void visit(BinaryExpr n, Void arg) {
            super.visit(n, arg);
//            System.out.println(n);
//            System.out.println(n.getOperator());
//            System.out.println(n.getLeft());
//            System.out.println(n.getRight());
            operators.add(n.getOperator().toString());
            operands.add(n.getLeft().toString());
            operands.add(n.getRight().toString());
        }
    }

    private static class LineCommentHandler extends VoidVisitorAdapter<Void> {
        public int counter = 0;

        @Override
        public void visit(LineComment n, Void arg) {
            super.visit(n, arg);
            counter++;
        }
    }

    private static class BlockCommentHandler extends VoidVisitorAdapter<Void> {
        public int counter = 0;

        @Override
        public void visit(BlockComment n, Void arg) {
            super.visit(n, arg);
            counter++;
        }
    }

    private static class JavadocCommentHandler extends VoidVisitorAdapter<Void> {
        public int counter = 0;

        @Override
        public void visit(JavadocComment n, Void arg) {
            super.visit(n, arg);
            counter++;
        }
    }

    private static class VariableHandler extends VoidVisitorAdapter<Void> {
        public int counter = 0;
        public int total_length = 0;

        @Override
        public void visit(VariableDeclarator n, Void arg) {
            super.visit(n, arg);
            counter++;
            total_length += n.getName().toString().length();
        }

        public float get_avg_len() {
            if (counter > 0) {
                return (float) (total_length) / (float) (counter);
            } else {
                return 0;
            }
        }
    }

    private static class IfHandler extends VoidVisitorAdapter<Void> {
        public int counter = 0;

        @Override
        public void visit(IfStmt n, Void arg) {
            super.visit(n, arg);
            counter++;
        }
    }

    private static class ForHandler extends VoidVisitorAdapter<Void> {
        public int counter = 0;

        @Override
        public void visit(ForStmt n, Void arg) {
            super.visit(n, arg);
            counter++;
        }
    }

    private static class DoHandler extends VoidVisitorAdapter<Void> {
        public int counter = 0;

        @Override
        public void visit(DoStmt n, Void arg) {
            super.visit(n, arg);
            counter++;
        }
    }

    private static class WhileHandler extends VoidVisitorAdapter<Void> {
        public int counter = 0;

        @Override
        public void visit(WhileStmt n, Void arg) {
            super.visit(n, arg);
            counter++;
        }
    }

    private static class CastHandler extends VoidVisitorAdapter<Void> {
        public int counter = 0;

        @Override
        public void visit(CastExpr n, Void arg) {
            super.visit(n, arg);
            counter++;
        }
    }

    private static class MethodHandler extends VoidVisitorAdapter<Void> {
        public ArrayList<Integer> complexities = new ArrayList<>();

        @Override
        public void visit(MethodDeclaration n, Void arg) {
            super.visit(n, arg);
            int complexity = 0;
            for (IfStmt ifStmt : n.findAll(IfStmt.class)) {
                // We found an "if" - cool, add one.
                complexity++;
                if (ifStmt.getElseStmt().isPresent()) {
                    // This "if" has an "else"
                    if (ifStmt.getElseStmt().get() instanceof IfStmt) {
                        // it's an "else-if". We already count that by counting the "if" above.
                    } else {
                        // it's an "else-something". Add it.
                        complexity++;
                    }
                }
            }
            for (ForStmt forStmt : n.findAll(ForStmt.class)) {
                // We found an "if" - cool, add one.
                complexity++;
            }
            for (DoStmt doStmt : n.findAll(DoStmt.class)) {
                // We found an "if" - cool, add one.
                complexity++;
            }
            for (SwitchStmt switchStmt : n.findAll(SwitchStmt.class)) {
                // We found an "if" - cool, add one.
                complexity++;
            }
            complexities.add(complexity);
        }

        public float get_avg_complexity() {
            float avg_complexity = 0;
            for (int complexity : complexities) {
                avg_complexity += complexity;
            }
            avg_complexity /= complexities.size();
            return avg_complexity;
        }
    }
}
