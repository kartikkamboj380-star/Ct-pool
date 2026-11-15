.class public final LB0/c;
.super Landroidx/fragment/app/e;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SetJavaScriptEnabled"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB0/c$a;
    }
.end annotation


# static fields
.field public static final o:LB0/c$a;


# instance fields
.field private m:LA0/g$a;

.field private n:Lv5/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LB0/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LB0/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LB0/c;->o:LB0/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/e;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic u(LB0/c;LA0/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LB0/c;->x(LA0/f;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final w()Landroid/webkit/WebView;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/webkit/WebView;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/webkit/WebView;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    return-object v0
.end method

.method private final x(LA0/f;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/e;->getDialog()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LB0/c;->n:Lv5/l;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    invoke-interface {v0, p1}, Lv5/l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    const-string v0, "dialog"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/fragment/app/e;->onCancel(Landroid/content/DialogInterface;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, LA0/f$a;->a:LA0/f$a;

    .line 10
    .line 11
    invoke-direct {p0, p1}, LB0/c;->x(LA0/f;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/e;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string v0, "authenticationAttempt"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, LA0/g$a;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LB0/c;->m:LA0/g$a;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    sget v0, LA0/c;->a:I

    .line 27
    .line 28
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/e;->setStyle(II)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 1
    const-string v0, "inflater"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    new-instance p1, Landroid/webkit/WebView;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-direct {p1, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 27
    .line 28
    .line 29
    new-instance p2, LA0/b;

    .line 30
    .line 31
    iget-object v0, p0, LB0/c;->m:LA0/g$a;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    const-string v2, "authenticationAttempt"

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    invoke-static {v2}, Lw5/k;->t(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    move-object v0, v1

    .line 42
    :cond_0
    invoke-virtual {v0}, LA0/g$a;->c()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v3, LB0/c$b;

    .line 47
    .line 48
    invoke-direct {v3, p0}, LB0/c$b;-><init>(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p2, v0, v3}, LA0/b;-><init>(Ljava/lang/String;Lv5/l;)V

    .line 52
    .line 53
    .line 54
    const-string v0, "FormInterceptorInterface"

    .line 55
    .line 56
    invoke-virtual {p1, p2, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance p2, LB0/b;

    .line 60
    .line 61
    iget-object v0, p0, LB0/c;->m:LA0/g$a;

    .line 62
    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    invoke-static {v2}, Lw5/k;->t(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    move-object v0, v1

    .line 69
    :cond_1
    sget-object v3, LA0/b;->c:LA0/b$a;

    .line 70
    .line 71
    invoke-virtual {v3}, LA0/b$a;->a()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-direct {p2, v0, v3}, LB0/b;-><init>(LA0/g$a;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 79
    .line 80
    .line 81
    if-eqz p3, :cond_2

    .line 82
    .line 83
    const-string p2, "webView"

    .line 84
    .line 85
    invoke-virtual {p3, p2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    if-eqz p2, :cond_4

    .line 90
    .line 91
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    iget-object p2, p0, LB0/c;->m:LA0/g$a;

    .line 96
    .line 97
    if-nez p2, :cond_3

    .line 98
    .line 99
    invoke-static {v2}, Lw5/k;->t(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    move-object v1, p2

    .line 104
    :goto_0
    invoke-virtual {v1}, LA0/g$a;->a()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    :goto_1
    return-object p1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "outState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/fragment/app/e;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, LB0/c;->w()Landroid/webkit/WebView;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 21
    .line 22
    .line 23
    :cond_0
    sget-object v1, Li5/u;->a:Li5/u;

    .line 24
    .line 25
    const-string v1, "webView"

    .line 26
    .line 27
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/e;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/e;->getDialog()Landroid/app/Dialog;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final v(Lv5/l;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LB0/c;->n:Lv5/l;

    .line 7
    .line 8
    return-void
.end method
