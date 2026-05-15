Repository metadata and `gh` CLI commands
=======================================


Use these commands to set repository metadata and topics with the GitHub CLI (`gh`). Replace `<owner>` with your username and ensure you are authenticated (`gh auth login`). The repository name is assumed to be `java-oop-assignments`.

Set description and website:

```bash
gh repo edit <owner>/java-oop-assignments --description "Java OOP assignments, examples and exercises" --homepage "https://<your-username>.github.io/java-oop-assignments/"
```

Set topics (tags):

```bash
gh api --method PUT -H "Accept: application/vnd.github.mercy-preview+json" /repos/<owner>/java-oop-assignments/topics -f names='["java","oop","assignments","examples","classroom"]'
```

Enable repository features via the web: go to the repository Settings → Features and enable `Releases`, `Deployments`, `Packages` as desired.

If you prefer, tell me your GitHub username and I can provide the exact commands to run locally or I can run them here if you authenticate.
