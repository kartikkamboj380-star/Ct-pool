.class public final synthetic Lg5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lg5/g;

.field public final synthetic n:Lh5/a;


# direct methods
.method public synthetic constructor <init>(Lg5/g;Lh5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/f;->m:Lg5/g;

    iput-object p2, p0, Lg5/f;->n:Lh5/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/f;->m:Lg5/g;

    iget-object v1, p0, Lg5/f;->n:Lh5/a;

    invoke-static {v0, v1}, Lg5/g;->d(Lg5/g;Lh5/a;)V

    return-void
.end method
