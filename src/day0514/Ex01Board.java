package day0514;
// 게시판 클래스와 어레이리스트를 활용하여
// 게시판 프로그램을 작성하시오
// 11시 30분까지

import types.Board;
import util.ScannerUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01Board {
    public static ArrayList<Board> boardList = new ArrayList<>();
    public static int nextId = 1;

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        String message = "1. 입력 2. 목록 3. 종료";
        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                insert();
            } else if (userChoice == 2) {
                printList();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    public static void insert() {
        Board b = new Board();
        b.setId(nextId++);

        String message;
        message = "글의 제목을 입력해주세요.";
        String title = ScannerUtil.nextLine(SCANNER, message);

        b.setTitle(title);

        message = "글의 작성자를 입력해주세요.";
        String writer = ScannerUtil.nextLine(SCANNER, message);
        b.setWriter(writer);

        message = "글의 내용을 입력해주세요.";
        String content = ScannerUtil.nextLine(SCANNER, message);
        b.setContent(content);

        boardList.add(b);

    }

    public static void printList() {
        if (boardList.isEmpty()) {
            System.out.println("아직 입력된 게시글이 존재하지 않습니다.");
        } else {
//            for (int i = 0; i < boardList.size(); i++) {
//                Board b = boardList.get(i);
//                System.out.printf("%d. %s - %s\n", b.id, b.title, b.writer);
//            }

            // 위의 코드를 간략화 시켜보자
            for (Board b : boardList) {
                System.out.printf("%d. %s - %s\n", b.getId(), b.getTitle(), b.getWriter());
            }

            String message = "상세보기할 글의 번호나 뒤로가실려면 0을 입력해주세요.";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            while (!validate(userChoice)) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(SCANNER, message);
            }

            if (userChoice != 0) {
                printOne(userChoice);
            }

        }
    }

    public static boolean validate(int id) {
        if (id == 0) {
            return true;
        }

        return boardList.contains(new Board(id));

    }

    public static void printOne(int id) {
        Board b = selectOne(id);
        b.printInfo();
        String message = "1. 수정 2. 삭제 3. 목록으로";
        int userChoice = ScannerUtil.nextInt(SCANNER, message, 1, 3);
        if (userChoice == 1) {
            update(id);
        } else if (userChoice == 2) {
            delete(id);
        } else if (userChoice == 3) {
            printList();
        }
    }

    public static Board selectOne(int id) {
        int index = boardList.indexOf(new Board(id));

        if (index != -1) {
            return boardList.get(index);
        } else {
            return null;
        }
    }

    public static void update(int id) {
        Board b = selectOne(id);
        String message;
        message = "새로운 제목을 입력해주세요.";
        String title = ScannerUtil.nextLine(SCANNER, message);
        b.setTitle(title);

        message = "새로운 내용을 입력해주세요.";
        String content = ScannerUtil.nextLine(SCANNER, message);
        b.setContent(content);

        printOne(id);
    }

    public static void delete(int id) {
        String message = "정말로 삭제하시겠습니까? Y/N";
        String answer = ScannerUtil.nextLine(SCANNER, message);
        if (answer.equalsIgnoreCase("Y")) {
            boardList.remove(new Board(id));
            printList();
        } else {
            printOne(id);
        }

    }

}














