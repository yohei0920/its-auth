### メモ
* springSecurityでデフォルトのユーザー名とパスワードを変更できる
* model.addAttribute("userList", Collections.emptyList());
  * viewに表示する値を決める
  * 第一引数がviewで指定する名前
  * 第二引数はこの段階ではデータがないため、空の配列を明示的に入れている
* SpringのUserServiceとUserRepositoryをRailsのUserModelが2役になっているイメージ
  * Springは4層アーキテクチャとも言われるらしい
  * Railsより責務が明確
* 再起動時にデータが消える
  * インメモリデータベースはサーバーのメモリ上にデータを保存するため、アプリケーションを再起動するとデータが消える
* userId, PW
  * tom, password1234
* bootstrap読み込み箇所
  * resources/templates/fragments/layout.html