Repository metadata and `gh` CLI commands
=======================================

Use these commands to set repository metadata and topics with the GitHub CLI (`gh`). Replace `<owner>` and `<repo>` with your values and ensure you are authenticated (`gh auth login`).

Set description and website:

```bash
gh repo edit <owner>/<repo> --description "Java in class — Java OOP examples, exercises and assignments" --homepage "https://<your-username>.github.io/java_in_class/"
```

Set topics (tags):

```bash
gh api --method PUT -H "Accept: application/vnd.github.mercy-preview+json" /repos/<owner>/<repo>/topics -f names='["java","oop","examples","assignments","classroom"]'
```

Enable repository features via the web: go to the repository Settings → Features and enable `Releases`, `Deployments`, `Packages` as desired.

If you prefer, tell me your GitHub username and repo name and I can provide the exact commands to run locally.
