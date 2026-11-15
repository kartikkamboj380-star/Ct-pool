.class Lcom/reactnativecommunity/webview/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/webview/l;->s(Ljava/lang/String;Ljava/lang/String;)Lm2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/lang/String;

.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Lcom/reactnativecommunity/webview/l;


# direct methods
.method constructor <init>(Lcom/reactnativecommunity/webview/l;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativecommunity/webview/l$a;->o:Lcom/reactnativecommunity/webview/l;

    iput-object p2, p0, Lcom/reactnativecommunity/webview/l$a;->m:Ljava/lang/String;

    iput-object p3, p0, Lcom/reactnativecommunity/webview/l$a;->n:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    return p2

    :cond_0
    array-length p1, p3

    if-lez p1, :cond_1

    aget p1, p3, p2

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/reactnativecommunity/webview/l$a;->o:Lcom/reactnativecommunity/webview/l;

    invoke-static {p1}, Lcom/reactnativecommunity/webview/l;->b(Lcom/reactnativecommunity/webview/l;)Landroid/app/DownloadManager$Request;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/reactnativecommunity/webview/l$a;->o:Lcom/reactnativecommunity/webview/l;

    iget-object p2, p0, Lcom/reactnativecommunity/webview/l$a;->m:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/l;->h(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/reactnativecommunity/webview/l$a;->o:Lcom/reactnativecommunity/webview/l;

    invoke-static {p1}, Lcom/reactnativecommunity/webview/l;->a(Lcom/reactnativecommunity/webview/l;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    iget-object p2, p0, Lcom/reactnativecommunity/webview/l$a;->n:Ljava/lang/String;

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_2
    :goto_0
    return v0
.end method
