.class public abstract Lcom/facebook/react/devsupport/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX1/e;


# instance fields
.field private A:I

.field private final B:LX1/b;

.field private C:Ljava/util/List;

.field private final D:Ljava/util/Map;

.field private final E:LS1/j;

.field private final a:Landroid/content/Context;

.field private final b:LS1/g;

.field private final c:Landroid/content/BroadcastReceiver;

.field private final d:Lcom/facebook/react/devsupport/g;

.field private final e:Ljava/util/LinkedHashMap;

.field private final f:Lcom/facebook/react/devsupport/a0;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/io/File;

.field private final i:Ljava/io/File;

.field private final j:Lcom/facebook/react/bridge/DefaultJSExceptionHandler;

.field private final k:LX1/c;

.field private final l:LX1/h;

.field private m:LS1/i;

.field private n:Landroid/app/AlertDialog;

.field private o:Lcom/facebook/react/devsupport/c;

.field private p:Z

.field private q:I

.field private r:Lcom/facebook/react/bridge/ReactContext;

.field private final s:Ln2/a;

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Ljava/lang/String;

.field private y:[LX1/j;

.field private z:LX1/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/react/devsupport/a0;Ljava/lang/String;ZLX1/i;LX1/b;ILjava/util/Map;LS1/j;LX1/c;LX1/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p5, Ljava/util/LinkedHashMap;

    invoke-direct {p5}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p5, p0, Lcom/facebook/react/devsupport/B;->e:Ljava/util/LinkedHashMap;

    const/4 p5, 0x0

    iput-boolean p5, p0, Lcom/facebook/react/devsupport/B;->p:Z

    iput p5, p0, Lcom/facebook/react/devsupport/B;->q:I

    iput-boolean p5, p0, Lcom/facebook/react/devsupport/B;->t:Z

    iput-boolean p5, p0, Lcom/facebook/react/devsupport/B;->u:Z

    iput-boolean p5, p0, Lcom/facebook/react/devsupport/B;->v:Z

    iput p5, p0, Lcom/facebook/react/devsupport/B;->A:I

    iput-object p2, p0, Lcom/facebook/react/devsupport/B;->f:Lcom/facebook/react/devsupport/a0;

    iput-object p1, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/facebook/react/devsupport/B;->g:Ljava/lang/String;

    new-instance p3, Lcom/facebook/react/devsupport/f;

    new-instance v0, Lcom/facebook/react/devsupport/m;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/m;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-direct {p3, p1, v0}, Lcom/facebook/react/devsupport/f;-><init>(Landroid/content/Context;Lcom/facebook/react/devsupport/f$b;)V

    iput-object p3, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    new-instance v0, Lcom/facebook/react/devsupport/g;

    invoke-interface {p3}, Ln2/a;->j()Lt2/d;

    move-result-object v1

    invoke-direct {v0, p3, p1, v1}, Lcom/facebook/react/devsupport/g;-><init>(Ln2/a;Landroid/content/Context;Lt2/d;)V

    iput-object v0, p0, Lcom/facebook/react/devsupport/B;->d:Lcom/facebook/react/devsupport/g;

    iput-object p6, p0, Lcom/facebook/react/devsupport/B;->B:LX1/b;

    new-instance p3, LS1/g;

    new-instance p6, Lcom/facebook/react/devsupport/n;

    invoke-direct {p6, p0}, Lcom/facebook/react/devsupport/n;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-direct {p3, p6, p7}, LS1/g;-><init>(LS1/g$a;I)V

    iput-object p3, p0, Lcom/facebook/react/devsupport/B;->b:LS1/g;

    iput-object p8, p0, Lcom/facebook/react/devsupport/B;->D:Ljava/util/Map;

    new-instance p3, Lcom/facebook/react/devsupport/B$a;

    invoke-direct {p3, p0}, Lcom/facebook/react/devsupport/B$a;-><init>(Lcom/facebook/react/devsupport/B;)V

    iput-object p3, p0, Lcom/facebook/react/devsupport/B;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0}, Lcom/facebook/react/devsupport/B;->p0()Ljava/lang/String;

    move-result-object p3

    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p7, "ReactNativeDevBundle.js"

    invoke-virtual {p6, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    new-instance p7, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p8

    invoke-direct {p7, p8, p6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p7, p0, Lcom/facebook/react/devsupport/B;->h:Ljava/io/File;

    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p3, p7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "_dev_js_split_bundles"

    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3, p5}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/devsupport/B;->i:Ljava/io/File;

    new-instance p1, Lcom/facebook/react/bridge/DefaultJSExceptionHandler;

    invoke-direct {p1}, Lcom/facebook/react/bridge/DefaultJSExceptionHandler;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/B;->j:Lcom/facebook/react/bridge/DefaultJSExceptionHandler;

    invoke-virtual {p0, p4}, Lcom/facebook/react/devsupport/B;->s(Z)V

    if-eqz p10, :cond_0

    goto :goto_0

    :cond_0
    new-instance p10, Lcom/facebook/react/devsupport/d;

    invoke-direct {p10, p2}, Lcom/facebook/react/devsupport/d;-><init>(Lcom/facebook/react/devsupport/a0;)V

    :goto_0
    iput-object p10, p0, Lcom/facebook/react/devsupport/B;->k:LX1/c;

    iput-object p9, p0, Lcom/facebook/react/devsupport/B;->E:LS1/j;

    if-eqz p11, :cond_1

    goto :goto_1

    :cond_1
    new-instance p11, Lcom/facebook/react/devsupport/Y;

    new-instance p1, Lcom/facebook/react/devsupport/o;

    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/o;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-direct {p11, p1}, Lcom/facebook/react/devsupport/Y;-><init>(Landroidx/core/util/h;)V

    :goto_1
    iput-object p11, p0, Lcom/facebook/react/devsupport/B;->l:LX1/h;

    return-void
.end method

.method private synthetic A0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->f:Lcom/facebook/react/devsupport/a0;

    invoke-interface {v0}, Lcom/facebook/react/devsupport/a0;->j()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/widget/EditText;

    invoke-direct {v1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const-string v2, "localhost:8081"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/react/q;->b:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, Lcom/facebook/react/devsupport/B$c;

    invoke-direct {v2, p0, v1}, Lcom/facebook/react/devsupport/B$c;-><init>(Lcom/facebook/react/devsupport/B;Landroid/widget/EditText;)V

    const v1, 0x104000a

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void

    :cond_1
    :goto_0
    const-string v0, "ReactNative"

    const-string v1, "Unable to launch change bundle location because react activity is not available"

    invoke-static {v0, v1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic B0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v0}, Ln2/a;->i()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-object v2, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v2, v0}, Ln2/a;->b(Z)V

    iget-object v2, p0, Lcom/facebook/react/devsupport/B;->r:Lcom/facebook/react/bridge/ReactContext;

    if-eqz v2, :cond_1

    const-class v3, Lcom/facebook/react/devsupport/HMRClient;

    invoke-virtual {v2, v3}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/devsupport/HMRClient;

    if-eqz v0, :cond_0

    invoke-interface {v2}, Lcom/facebook/react/devsupport/HMRClient;->enable()V

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Lcom/facebook/react/devsupport/HMRClient;->disable()V

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v0}, Ln2/a;->h()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v2, Lcom/facebook/react/q;->i:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v0, v1}, Ln2/a;->l(Z)V

    invoke-interface {p0}, LX1/e;->q()V

    :cond_2
    return-void
.end method

.method private synthetic C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v0}, Ln2/a;->g()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->f:Lcom/facebook/react/devsupport/a0;

    invoke-interface {v0}, Lcom/facebook/react/devsupport/a0;->j()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "ReactNative"

    const-string v1, "Unable to get reference to react activity"

    invoke-static {v0, v1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/facebook/react/devsupport/c;->h(Landroid/content/Context;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v0}, Ln2/a;->g()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Ln2/a;->e(Z)V

    return-void
.end method

.method private synthetic D0()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    const-class v2, Lcom/facebook/react/devsupport/h;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private synthetic E0([LX1/d;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    aget-object p1, p1, p3

    .line 2
    .line 3
    invoke-interface {p1}, LX1/d;->a()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/facebook/react/devsupport/B;->n:Landroid/app/AlertDialog;

    .line 8
    .line 9
    return-void
.end method

.method private synthetic F0(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/devsupport/B;->n:Landroid/app/AlertDialog;

    return-void
.end method

.method public static synthetic G(Lcom/facebook/react/devsupport/B;ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/devsupport/B;->I0(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method private synthetic G0(Ljava/lang/String;[LX1/j;ILX1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/react/devsupport/B;->S0(Ljava/lang/String;[LX1/j;ILX1/f;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/facebook/react/devsupport/B;->m:LS1/i;

    .line 5
    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    const-string p1, "RedBox"

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/B;->c(Ljava/lang/String;)LS1/i;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    :goto_0
    iput-object p2, p0, Lcom/facebook/react/devsupport/B;->m:LS1/i;

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance p2, Lcom/facebook/react/devsupport/e0;

    .line 20
    .line 21
    invoke-direct {p2, p0}, Lcom/facebook/react/devsupport/e0;-><init>(LX1/e;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_1
    iget-object p2, p0, Lcom/facebook/react/devsupport/B;->m:LS1/i;

    .line 26
    .line 27
    invoke-interface {p2, p1}, LS1/i;->f(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object p1, p0, Lcom/facebook/react/devsupport/B;->m:LS1/i;

    .line 31
    .line 32
    invoke-interface {p1}, LS1/i;->a()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    iget-object p1, p0, Lcom/facebook/react/devsupport/B;->m:LS1/i;

    .line 40
    .line 41
    invoke-interface {p1}, LS1/i;->b()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static synthetic H(Lcom/facebook/react/devsupport/B;Ljava/lang/String;[LX1/j;ILX1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/react/devsupport/B;->G0(Ljava/lang/String;[LX1/j;ILX1/f;)V

    return-void
.end method

.method private synthetic H0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v0}, Ln2/a;->a()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Ln2/a;->c(Z)V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->f:Lcom/facebook/react/devsupport/a0;

    invoke-interface {v0}, Lcom/facebook/react/devsupport/a0;->h()V

    return-void
.end method

.method public static synthetic I(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/B;->H0()V

    return-void
.end method

.method private synthetic I0(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->m:LS1/i;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LS1/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget v0, p0, Lcom/facebook/react/devsupport/B;->A:I

    if-eq p1, v0, :cond_2

    :cond_1
    return-void

    :cond_2
    invoke-static {p3}, Lcom/facebook/react/devsupport/h0;->b(Lcom/facebook/react/bridge/ReadableArray;)[LX1/j;

    move-result-object p3

    sget-object v0, LX1/f;->n:LX1/f;

    invoke-direct {p0, p2, p3, p1, v0}, Lcom/facebook/react/devsupport/B;->S0(Ljava/lang/String;[LX1/j;ILX1/f;)V

    iget-object p1, p0, Lcom/facebook/react/devsupport/B;->m:LS1/i;

    invoke-interface {p1}, LS1/i;->b()V

    return-void
.end method

.method public static synthetic J(Lcom/facebook/react/devsupport/B;LX1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B;->t0(LX1/g;)V

    return-void
.end method

.method private J0(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Exception in native call from JS"

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_1

    const-string v3, "\n\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_1

    :cond_1
    instance-of v1, p1, Lcom/facebook/react/common/JavascriptException;

    if-eqz v1, :cond_2

    const-string v0, "ReactNative"

    invoke-static {v0, v2, p1}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [LX1/j;

    const/4 v1, -0x1

    sget-object v2, LX1/f;->n:LX1/f;

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/facebook/react/devsupport/B;->Q0(Ljava/lang/String;[LX1/j;ILX1/f;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/devsupport/B;->R0(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public static synthetic K(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/B;->C0()V

    return-void
.end method

.method private K0()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->v:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->o:Lcom/facebook/react/devsupport/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v1}, Ln2/a;->g()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/devsupport/c;->i(Z)V

    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->u:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->b:LS1/g;

    iget-object v2, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    const-string v3, "sensor"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/SensorManager;

    invoke-virtual {v0, v2}, LS1/g;->e(Landroid/hardware/SensorManager;)V

    iput-boolean v1, p0, Lcom/facebook/react/devsupport/B;->u:Z

    :cond_1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->t:Z

    if-nez v0, :cond_2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iget-object v2, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/facebook/react/devsupport/B;->o0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    iget-object v3, p0, Lcom/facebook/react/devsupport/B;->c:Landroid/content/BroadcastReceiver;

    invoke-direct {p0, v2, v3, v0, v1}, Lcom/facebook/react/devsupport/B;->i0(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Z)V

    iput-boolean v1, p0, Lcom/facebook/react/devsupport/B;->t:Z

    :cond_2
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->p:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->k:LX1/c;

    const-string v1, "Reloading..."

    invoke-interface {v0, v1}, LX1/c;->a(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->d:Lcom/facebook/react/devsupport/g;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/react/devsupport/B$h;

    invoke-direct {v2, p0}, Lcom/facebook/react/devsupport/B$h;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/devsupport/g;->A(Ljava/lang/String;Lcom/facebook/react/devsupport/g$h;)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->o:Lcom/facebook/react/devsupport/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0, v1}, Lcom/facebook/react/devsupport/c;->i(Z)V

    :cond_5
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->u:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->b:LS1/g;

    invoke-virtual {v0}, LS1/g;->f()V

    iput-boolean v1, p0, Lcom/facebook/react/devsupport/B;->u:Z

    :cond_6
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->t:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/react/devsupport/B;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iput-boolean v1, p0, Lcom/facebook/react/devsupport/B;->t:Z

    :cond_7
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/B;->o()V

    invoke-direct {p0}, Lcom/facebook/react/devsupport/B;->s0()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->k:LX1/c;

    invoke-interface {v0}, LX1/c;->c()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->d:Lcom/facebook/react/devsupport/g;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/g;->i()V

    :goto_0
    return-void
.end method

.method public static synthetic L(Lcom/facebook/react/devsupport/B;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B;->w0(Z)V

    return-void
.end method

.method public static synthetic M(Lcom/facebook/react/devsupport/B;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B;->v0(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic N(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/B;->K0()V

    return-void
.end method

.method private N0(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/i;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/i;-><init>(Lcom/facebook/react/devsupport/B;Ljava/lang/Exception;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic O(Lcom/facebook/react/devsupport/B;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/B;->u0()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method private O0(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->r:Lcom/facebook/react/bridge/ReactContext;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/facebook/react/devsupport/B;->r:Lcom/facebook/react/bridge/ReactContext;

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->o:Lcom/facebook/react/devsupport/c;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/react/devsupport/c;->i(Z)V

    :cond_1
    if-eqz p1, :cond_2

    new-instance v0, Lcom/facebook/react/devsupport/c;

    invoke-direct {v0, p1}, Lcom/facebook/react/devsupport/c;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    iput-object v0, p0, Lcom/facebook/react/devsupport/B;->o:Lcom/facebook/react/devsupport/c;

    :cond_2
    iget-object p1, p0, Lcom/facebook/react/devsupport/B;->r:Lcom/facebook/react/bridge/ReactContext;

    if-eqz p1, :cond_4

    :try_start_0
    new-instance p1, Ljava/net/URL;

    invoke-virtual {p0}, Lcom/facebook/react/devsupport/B;->v()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/net/URL;->getPort()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    invoke-virtual {p1}, Ljava/net/URL;->getPort()I

    move-result p1

    :goto_0
    move v6, p1

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/net/URL;->getDefaultPort()I

    move-result p1

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/facebook/react/devsupport/B;->r:Lcom/facebook/react/bridge/ReactContext;

    const-class v0, Lcom/facebook/react/devsupport/HMRClient;

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/facebook/react/devsupport/HMRClient;

    const-string v3, "android"

    iget-object p1, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {p1}, Ln2/a;->i()Z

    move-result v7

    invoke-interface/range {v2 .. v7}, Lcom/facebook/react/devsupport/HMRClient;->setup(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/devsupport/B;->R0(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_3
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/B;->M0()V

    return-void
.end method

.method public static synthetic P(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/B;->D0()V

    return-void
.end method

.method private P0(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ljava/net/URL;->getPort()I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_1

    invoke-virtual {v0}, Ljava/net/URL;->getPort()I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/net/URL;->getDefaultPort()I

    move-result p1

    :goto_0
    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->k:LX1/c;

    iget-object v2, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/react/q;->l:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v3, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, LX1/c;->a(Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/devsupport/B;->p:Z

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bundle url format is invalid. \n\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic Q(Lcom/facebook/react/devsupport/B;[LX1/d;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/devsupport/B;->E0([LX1/d;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private Q0(Ljava/lang/String;[LX1/j;ILX1/f;)V
    .locals 7

    .line 1
    new-instance v6, Lcom/facebook/react/devsupport/t;

    .line 2
    .line 3
    move-object v0, v6

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move v4, p3

    .line 8
    move-object v5, p4

    .line 9
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/devsupport/t;-><init>(Lcom/facebook/react/devsupport/B;Ljava/lang/String;[LX1/j;ILX1/f;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v6}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic R(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/B;->B0()V

    return-void
.end method

.method public static synthetic S(Lcom/facebook/react/devsupport/B;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B;->y0(Z)V

    return-void
.end method

.method private S0(Ljava/lang/String;[LX1/j;ILX1/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/B;->x:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/B;->y:[LX1/j;

    .line 4
    .line 5
    iput p3, p0, Lcom/facebook/react/devsupport/B;->A:I

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/react/devsupport/B;->z:LX1/f;

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic T(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/B;->A0()V

    return-void
.end method

.method public static synthetic U(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/B;->z0()V

    return-void
.end method

.method public static synthetic V(Lcom/facebook/react/devsupport/B;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B;->x0(Z)V

    return-void
.end method

.method public static synthetic W(Lcom/facebook/react/devsupport/B;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B;->F0(Landroid/content/DialogInterface;)V

    return-void
.end method

.method static bridge synthetic X(Lcom/facebook/react/devsupport/B;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic Y(Lcom/facebook/react/devsupport/B;)LX1/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/B;->B:LX1/b;

    return-object p0
.end method

.method static bridge synthetic Z(Lcom/facebook/react/devsupport/B;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/B;->D:Ljava/util/Map;

    return-object p0
.end method

.method static bridge synthetic a0(Lcom/facebook/react/devsupport/B;)LX1/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/B;->k:LX1/c;

    return-object p0
.end method

.method static bridge synthetic b0(Lcom/facebook/react/devsupport/B;)Lcom/facebook/react/devsupport/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/B;->d:Lcom/facebook/react/devsupport/g;

    return-object p0
.end method

.method static bridge synthetic c0(Lcom/facebook/react/devsupport/B;)Ln2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    return-object p0
.end method

.method static bridge synthetic d0(Lcom/facebook/react/devsupport/B;)Lcom/facebook/react/devsupport/a0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/B;->f:Lcom/facebook/react/devsupport/a0;

    return-object p0
.end method

.method static bridge synthetic e0(Lcom/facebook/react/devsupport/B;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/B;->w:Z

    return-void
.end method

.method static bridge synthetic f0(Lcom/facebook/react/devsupport/B;Lt2/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B;->q0(Lt2/h;)V

    return-void
.end method

.method static bridge synthetic g0(Lcom/facebook/react/devsupport/B;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B;->N0(Ljava/lang/Exception;)V

    return-void
.end method

.method static bridge synthetic h0(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/B;->o0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private i0(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    if-lt v0, v1, :cond_1

    if-eqz p4, :cond_0

    const/4 p4, 0x2

    goto :goto_0

    :cond_0
    const/4 p4, 0x4

    :goto_0
    invoke-static {p1, p2, p3, p4}, Le0/a;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    goto :goto_1

    :cond_1
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :goto_1
    return-void
.end method

.method private m0()Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/B;->n0()Lcom/facebook/react/devsupport/a0;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/react/devsupport/a0;->b()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static o0(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".RELOAD_APP_ACTION"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private q0(Lt2/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->r:Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-class v1, Lcom/facebook/react/devsupport/JSCHeapCapture;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/facebook/react/devsupport/JSCHeapCapture;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/facebook/react/devsupport/B$f;

    .line 27
    .line 28
    invoke-direct {v2, p0, p1}, Lcom/facebook/react/devsupport/B$f;-><init>(Lcom/facebook/react/devsupport/B;Lt2/h;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/devsupport/JSCHeapCapture;->captureHeap(Ljava/lang/String;Lcom/facebook/react/devsupport/JSCHeapCapture$a;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method private s0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->n:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/devsupport/B;->n:Landroid/app/AlertDialog;

    :cond_0
    return-void
.end method

.method private synthetic t0(LX1/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->d:Lcom/facebook/react/devsupport/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/devsupport/g;->w(LX1/g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic u0()Landroid/content/Context;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->f:Lcom/facebook/react/devsupport/a0;

    invoke-interface {v0}, Lcom/facebook/react/devsupport/a0;->j()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic v0(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    instance-of v0, p1, LS1/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LS1/c;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/devsupport/B;->R0(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v1, Lcom/facebook/react/q;->q:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_1
    return-void
.end method

.method private synthetic w0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v0, p1}, Ln2/a;->e(Z)V

    return-void
.end method

.method private synthetic x0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v0, p1}, Ln2/a;->b(Z)V

    invoke-interface {p0}, LX1/e;->q()V

    return-void
.end method

.method private synthetic y0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v0, p1}, Ln2/a;->f(Z)V

    invoke-interface {p0}, LX1/e;->q()V

    return-void
.end method

.method private synthetic z0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/B;->E()V

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->v:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/react/devsupport/B;->h:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->lastModified()J

    move-result-wide v3

    iget-wide v5, v2, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v2, v3, v5

    if-lez v2, :cond_2

    new-instance v2, Ljava/io/File;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "/data/local/tmp/exopackage/%s//secondary-dex"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v4, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    move-result-wide v6
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long v0, v4, v6

    if-lez v0, :cond_0

    move v1, v3

    :cond_0
    return v1

    :cond_1
    return v3

    :catch_0
    const-string v0, "ReactNative"

    const-string v2, "DevSupport is unable to get current app info"

    invoke-static {v0, v2}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return v1
.end method

.method public B()[LX1/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->y:[LX1/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public C()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->n:Landroid/app/AlertDialog;

    if-nez v0, :cond_c

    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->v:Z

    if-eqz v0, :cond_c

    invoke-static {}, Landroid/app/ActivityManager;->isUserAMonkey()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_6

    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v2, Lcom/facebook/react/q;->p:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/react/devsupport/B$b;

    invoke-direct {v2, p0}, Lcom/facebook/react/devsupport/B$b;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v1}, Ln2/a;->m()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v1, v2}, Ln2/a;->f(Z)V

    invoke-interface {p0}, LX1/e;->q()V

    :cond_1
    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v1}, Ln2/a;->k()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v1}, Ln2/a;->m()Z

    move-result v1

    if-nez v1, :cond_4

    iget-boolean v1, p0, Lcom/facebook/react/devsupport/B;->w:Z

    iget-object v3, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    if-eqz v1, :cond_2

    sget v4, Lcom/facebook/react/q;->c:I

    goto :goto_0

    :cond_2
    sget v4, Lcom/facebook/react/q;->d:I

    :goto_0
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v1, :cond_3

    invoke-interface {v6, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v1, Lcom/facebook/react/devsupport/w;

    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/w;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-virtual {v0, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/react/q;->b:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/facebook/react/devsupport/x;

    invoke-direct {v3, p0}, Lcom/facebook/react/devsupport/x;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-virtual {v0, v1, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/react/q;->k:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/facebook/react/devsupport/B$d;

    invoke-direct {v3, p0}, Lcom/facebook/react/devsupport/B$d;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-virtual {v0, v1, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v1}, Ln2/a;->i()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/react/q;->j:I

    :goto_1
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/react/q;->g:I

    goto :goto_1

    :goto_2
    new-instance v3, Lcom/facebook/react/devsupport/y;

    invoke-direct {v3, p0}, Lcom/facebook/react/devsupport/y;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-virtual {v0, v1, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    invoke-interface {v1}, Ln2/a;->g()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/react/q;->o:I

    :goto_3
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_6
    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/react/q;->n:I

    goto :goto_3

    :goto_4
    new-instance v3, Lcom/facebook/react/devsupport/z;

    invoke-direct {v3, p0}, Lcom/facebook/react/devsupport/z;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-virtual {v0, v1, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/react/q;->r:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/facebook/react/devsupport/A;

    invoke-direct {v3, p0}, Lcom/facebook/react/devsupport/A;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-virtual {v0, v1, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->e:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v1

    if-lez v1, :cond_7

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->e:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    :cond_7
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    new-array v3, v2, [LX1/d;

    invoke-interface {v1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, [LX1/d;

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->f:Lcom/facebook/react/devsupport/a0;

    invoke-interface {v1}, Lcom/facebook/react/devsupport/a0;->j()Landroid/app/Activity;

    move-result-object v8

    if-eqz v8, :cond_b

    invoke-virtual {v8}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_8

    goto/16 :goto_5

    :cond_8
    new-instance v9, Landroid/widget/LinearLayout;

    invoke-direct {v9, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v9, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v4, Lcom/facebook/react/q;->e:I

    invoke-virtual {p0}, Lcom/facebook/react/devsupport/B;->p0()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v8, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v4, 0x32

    invoke-virtual {v3, v2, v4, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    const/16 v4, 0x11

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    const/high16 v5, 0x41800000    # 16.0f

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v3}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v3, v5, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    invoke-virtual {v9, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/facebook/react/devsupport/B;->m0()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v5, Lcom/facebook/react/q;->f:I

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v8, v5, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v1, 0x14

    invoke-virtual {v3, v2, v1, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v9, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_9
    new-instance v10, Lcom/facebook/react/devsupport/B$e;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, [Ljava/lang/String;

    const v4, 0x1090003

    move-object v1, v10

    move-object v2, p0

    move-object v3, v8

    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/devsupport/B$e;-><init>(Lcom/facebook/react/devsupport/B;Landroid/content/Context;I[Ljava/lang/String;Ljava/util/Set;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, v8}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v9}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/facebook/react/devsupport/j;

    invoke-direct {v1, p0, v7}, Lcom/facebook/react/devsupport/j;-><init>(Lcom/facebook/react/devsupport/B;[LX1/d;)V

    invoke-virtual {v0, v10, v1}, Landroid/app/AlertDialog$Builder;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/facebook/react/devsupport/k;

    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/k;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/devsupport/B;->n:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->r:Lcom/facebook/react/bridge/ReactContext;

    if-eqz v0, :cond_a

    const-class v1, Lcom/facebook/react/modules/core/RCTNativeAppEventEmitter;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/modules/core/RCTNativeAppEventEmitter;

    const-string v1, "RCTDevMenuShown"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/modules/core/RCTNativeAppEventEmitter;->emit(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_a
    return-void

    :cond_b
    :goto_5
    const-string v0, "ReactNative"

    const-string v1, "Unable to launch dev options menu because react activity isn\'t available"

    invoke-static {v0, v1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    :goto_6
    return-void
.end method

.method public D(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->r:Lcom/facebook/react/bridge/ReactContext;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B;->O0(Lcom/facebook/react/bridge/ReactContext;)V

    :cond_0
    return-void
.end method

.method public E()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->d:Lcom/facebook/react/devsupport/g;

    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->r:Lcom/facebook/react/bridge/ReactContext;

    iget-object v2, p0, Lcom/facebook/react/devsupport/B;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/react/q;->m:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/devsupport/g;->y(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;)V

    return-void
.end method

.method public F(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/u;

    invoke-direct {v0, p0, p3, p1, p2}, Lcom/facebook/react/devsupport/u;-><init>(Lcom/facebook/react/devsupport/B;ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public L0(Ljava/lang/String;LX1/a;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->DOWNLOAD_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B;->P0(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/facebook/react/devsupport/a$c;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/facebook/react/devsupport/a$c;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->d:Lcom/facebook/react/devsupport/g;

    .line 15
    .line 16
    new-instance v2, Lcom/facebook/react/devsupport/B$g;

    .line 17
    .line 18
    invoke-direct {v2, p0, v0, p2}, Lcom/facebook/react/devsupport/B$g;-><init>(Lcom/facebook/react/devsupport/B;Lcom/facebook/react/devsupport/a$c;LX1/a;)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lcom/facebook/react/devsupport/B;->h:Ljava/io/File;

    .line 22
    .line 23
    invoke-virtual {v1, v2, p2, p1, v0}, Lcom/facebook/react/devsupport/g;->o(LX1/b;Ljava/io/File;Ljava/lang/String;Lcom/facebook/react/devsupport/a$c;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public M0()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->isOnUiThread()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/devsupport/B;->K0()V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/s;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/s;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method public R0(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-string v0, "ReactNative"

    const-string v1, "Exception in native call"

    invoke-static {v0, v1, p2}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2}, Lcom/facebook/react/devsupport/h0;->a(Ljava/lang/Throwable;)[LX1/j;

    move-result-object p2

    const/4 v0, -0x1

    sget-object v1, LX1/f;->o:LX1/f;

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/facebook/react/devsupport/B;->Q0(Ljava/lang/String;[LX1/j;ILX1/f;)V

    return-void
.end method

.method public a(Ljava/lang/String;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->f:Lcom/facebook/react/devsupport/a0;

    invoke-interface {v0, p1}, Lcom/facebook/react/devsupport/a0;->a(Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public b(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->v:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/q;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/q;-><init>(Lcom/facebook/react/devsupport/B;Z)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c(Ljava/lang/String;)LS1/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->E:LS1/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    invoke-interface {v0, p1}, LS1/j;->c(Ljava/lang/String;)LS1/i;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->f:Lcom/facebook/react/devsupport/a0;

    invoke-interface {v0, p1}, Lcom/facebook/react/devsupport/a0;->d(Landroid/view/View;)V

    return-void
.end method

.method public e(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->v:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/l;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/l;-><init>(Lcom/facebook/react/devsupport/B;Z)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public f(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->v:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/v;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/v;-><init>(Lcom/facebook/react/devsupport/B;Z)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->l:LX1/h;

    invoke-interface {v0}, LX1/h;->g()V

    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->v:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/r;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/r;-><init>(Lcom/facebook/react/devsupport/B;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public handleException(Ljava/lang/Exception;)V
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->v:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B;->J0(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->j:Lcom/facebook/react/bridge/DefaultJSExceptionHandler;

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/DefaultJSExceptionHandler;->handleException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public i(Ljava/lang/String;LX1/e$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->l:LX1/h;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LX1/h;->i(Ljava/lang/String;LX1/e$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public j()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->f:Lcom/facebook/react/devsupport/a0;

    invoke-interface {v0}, Lcom/facebook/react/devsupport/a0;->j()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public j0()LX1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->k:LX1/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k0()Lcom/facebook/react/devsupport/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->d:Lcom/facebook/react/devsupport/g;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->x:Ljava/lang/String;

    return-object v0
.end method

.method public l0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->g:Ljava/lang/String;

    return-object v0
.end method

.method public m()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->d:Lcom/facebook/react/devsupport/g;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/g;->h()V

    return-void
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->v:Z

    return v0
.end method

.method public n0()Lcom/facebook/react/devsupport/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->f:Lcom/facebook/react/devsupport/a0;

    return-object v0
.end method

.method public o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->m:LS1/i;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, LS1/i;->c()V

    return-void
.end method

.method public p(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B;->O0(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method

.method protected abstract p0()Ljava/lang/String;
.end method

.method public r(Landroid/util/Pair;)Landroid/util/Pair;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->C:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method protected r0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->k:LX1/c;

    invoke-interface {v0}, LX1/c;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/devsupport/B;->p:Z

    return-void
.end method

.method public s(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/B;->v:Z

    invoke-virtual {p0}, Lcom/facebook/react/devsupport/B;->M0()V

    return-void
.end method

.method public t()LX1/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->z:LX1/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public u(LX1/g;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/p;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/p;-><init>(Lcom/facebook/react/devsupport/B;LX1/g;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public v()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/devsupport/B;->d:Lcom/facebook/react/devsupport/g;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/facebook/react/devsupport/g;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()Ln2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->s:Ln2/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public x(Ljava/lang/String;LX1/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->e:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public y()LX1/i;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public z()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/B;->v:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/devsupport/B;->d:Lcom/facebook/react/devsupport/g;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/g;->z()V

    :cond_0
    return-void
.end method
