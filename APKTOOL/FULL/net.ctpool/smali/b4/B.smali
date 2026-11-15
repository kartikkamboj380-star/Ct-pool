.class public final synthetic Lb4/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD4/a$a;


# instance fields
.field public final synthetic a:LD4/a$a;

.field public final synthetic b:LD4/a$a;


# direct methods
.method public synthetic constructor <init>(LD4/a$a;LD4/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/B;->a:LD4/a$a;

    iput-object p2, p0, Lb4/B;->b:LD4/a$a;

    return-void
.end method


# virtual methods
.method public final a(LD4/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb4/B;->a:LD4/a$a;

    iget-object v1, p0, Lb4/B;->b:LD4/a$a;

    invoke-static {v0, v1, p1}, Lb4/C;->c(LD4/a$a;LD4/a$a;LD4/b;)V

    return-void
.end method
