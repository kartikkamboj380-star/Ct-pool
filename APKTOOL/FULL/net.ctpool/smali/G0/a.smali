.class public final synthetic LG0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/Callback;


# instance fields
.field public final synthetic a:LG0/d;

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(LG0/d;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG0/a;->a:LG0/d;

    iput-object p2, p0, LG0/a;->b:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final invoke([Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LG0/a;->a:LG0/d;

    iget-object v1, p0, LG0/a;->b:Landroid/app/Activity;

    invoke-static {v0, v1, p1}, LG0/d;->b(LG0/d;Landroid/app/Activity;[Ljava/lang/Object;)V

    return-void
.end method
