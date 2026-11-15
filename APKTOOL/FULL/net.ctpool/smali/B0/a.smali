.class public final synthetic LB0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Landroid/webkit/WebView;

.field public final synthetic n:LB0/b;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/WebView;LB0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/a;->m:Landroid/webkit/WebView;

    iput-object p2, p0, LB0/a;->n:LB0/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LB0/a;->m:Landroid/webkit/WebView;

    iget-object v1, p0, LB0/a;->n:LB0/b;

    invoke-static {v0, v1}, LB0/b;->a(Landroid/webkit/WebView;LB0/b;)V

    return-void
.end method
