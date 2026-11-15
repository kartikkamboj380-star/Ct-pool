.class final Ll3/j;
.super Ll3/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Ll3/k;


# direct methods
.method constructor <init>(Ll3/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll3/j;->a:Ll3/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ll3/e;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final H(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Ll3/j;->a:Ll3/k;

    .line 4
    .line 5
    iget-object v1, v0, Ll3/k;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v1}, Ll3/r;->c(Landroid/content/Context;)Ll3/r;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v0, v0, Ll3/k;->b:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 12
    .line 13
    invoke-virtual {v1, v0, p1}, Ll3/r;->e(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Ll3/j;->a:Ll3/k;

    .line 17
    .line 18
    new-instance v1, Lk3/b;

    .line 19
    .line 20
    invoke-direct {v1, p1, p2}, Lk3/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
