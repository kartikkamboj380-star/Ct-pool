.class public final synthetic La2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:La2/f;

.field public final synthetic n:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(La2/f;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/d;->m:La2/f;

    iput-object p2, p0, La2/d;->n:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, La2/d;->m:La2/f;

    iget-object v1, p0, La2/d;->n:Landroid/view/View;

    invoke-static {v0, v1}, La2/f;->b(La2/f;Landroid/view/View;)V

    return-void
.end method
